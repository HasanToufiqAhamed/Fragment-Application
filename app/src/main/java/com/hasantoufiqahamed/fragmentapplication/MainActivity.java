package com.hasantoufiqahamed.fragmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void apple(View view) {
        NewFragment a=new NewFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.a_for_alligator);
        player.start();
    }

    @SuppressLint("ResourceType")
    public void buttonB(View view) {
        BFragment a=new BFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.b_for_bear);
        player.start();
    }

    public void c(View view) {
        CFragment a=new CFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.c_for_cat);
        player.start();
    }

    public void d(View view) {
        DFragment a=new DFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.d_for_duck);
        player.start();
    }

    public void e(View view) {
        EFragment a=new EFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.e_for_elephant);
        player.start();
    }

    public void f(View view) {
        FFragment a=new FFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.f_for_fox);
        player.start();
    }

    public void g(View view) {
        GFragment a=new GFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.g_for_giraffe);
        player.start();
    }

    public void h(View view) {
        HFragment a=new HFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.h_for_horse);
        player.start();
    }

    public void i(View view) {
        IFragment a=new IFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.i_for_iguana);
        player.start();
    }

    public void j(View view) {
        JFragment a=new JFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.j_for_jellyfish);
        player.start();
    }

    public void k(View view) {
        KFragment a=new KFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.k_for_koala);
        player.start();
    }

    public void l(View view) {
        LFragment a=new LFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.l_for_lion);
        player.start();
    }

    public void m(View view) {
        MFragment a=new MFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.m_for_monkey);
        player.start();
    }

    public void n(View view) {
        NFragment a=new NFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.n_for_narwhal);
        player.start();
    }

    public void o(View view) {
        OFragment a=new OFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.o_for_owl);
        player.start();
    }

    public void p(View view) {
        PFragment a=new PFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.p_for_pinguin);
        player.start();
    }

    public void q(View view) {
        QFragment a=new QFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.q_for_quail);
        player.start();
    }

    public void r(View view) {
        RFragment a=new RFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.r_for_rhino);
        player.start();
    }

    public void s(View view) {
        SFragment a=new SFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.s_for_squirrel);
        player.start();
    }

    public void t(View view) {
        TFragment a=new TFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.t_for_turtle);
        player.start();
    }

    public void u(View view) {
        UFragment a=new UFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.u_for_unicorn);
        player.start();
    }

    public void v(View view) {
        VFragment a=new VFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.v_for_vulture);
        player.start();
    }

    public void w(View view) {
        WFragment a=new WFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.w_for_whale);
        player.start();
    }

    public void x(View view) {
        XFragment a=new XFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.x_for_xrayfish);
        player.start();
    }

    public void y(View view) {
        YFragment a=new YFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.y_for_yak);
        player.start();
    }

    public void z(View view) {
        ZFragment a=new ZFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentId, a).commit();

        MediaPlayer player=MediaPlayer.create(this, R.raw.z_for_zebra);
        player.start();
    }
}
