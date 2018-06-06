package com.montywu.demo.componentsbasicsample.ui.main;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.montywu.demo.componentsbasicsample.R;
import com.montywu.demo.componentsbasicsample.databinding.MainFragmentBinding;
import com.montywu.demo.componentsbasicsample.entity.User;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        MainFragmentBinding inflate = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false);

        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainFragmentBinding mainFragmentBinding = DataBindingUtil.bind(view);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        mViewModel.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                Toast.makeText(getContext(),user.firstName,Toast.LENGTH_LONG).show();
            }
        });

        User user = new User("wu","Monty");
        mainFragmentBinding.setUser(user);

        mViewModel.getUser().setValue(user);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

}
