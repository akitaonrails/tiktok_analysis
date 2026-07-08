package com.ss.android.ugc.aweme.friendstab.service;

import X.C0NCM;
import X.C0OB8;
import X.C1360330lVH;
import X.C19EG;
import X.EnumC1392960mLu;
import X.EnumC1586970rOp;
import X.EnumC1587000rOs;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent;
import java.io.File;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes25.dex */
public interface IFriendsTabV3Service {
    void Du();

    int Eu(C0OB8 c0ob8);

    void Fu(EnumC1586970rOp enumC1586970rOp);

    IInterceptor Gu();

    C19EG Hu();

    String Iu(Fragment fragment);

    DefaultLifecycleObserver Ju();

    void Kn(String str);

    int Ku(Context context, C0OB8 c0ob8);

    View Lr();

    boolean Lu(Fragment fragment, Aweme aweme);

    void Mu(int i);

    boolean Nu(String str);

    void On();

    DefaultLifecycleObserver Or();

    void Ou(Object obj, C1360330lVH c1360330lVH);

    boolean Pu(Fragment fragment);

    void Qa();

    void Qu();

    boolean Ru();

    void Su(C0NCM c0ncm);

    void Tu();

    void Uu();

    Fragment Vu();

    void Wa(String str, String str2);

    void Wu();

    BottomTabProtocol Xu();

    void Yu(String str);

    File Zu(String str);

    boolean av(C0OB8 c0ob8);

    void bv(Context context, Aweme aweme, String str);

    boolean cv();

    void dv(FriendsUserNewContent friendsUserNewContent, EnumC1587000rOs enumC1587000rOs, EnumC1586970rOp enumC1586970rOp);

    void ev(String str, EnumC1392960mLu enumC1392960mLu);

    boolean fv(C0OB8 c0ob8);

    void gv(AwS555S0100000_11 awS555S0100000_11);

    boolean hv();

    void runDeferredRedDotTask(EnumC1586970rOp enumC1586970rOp, boolean z);
}
