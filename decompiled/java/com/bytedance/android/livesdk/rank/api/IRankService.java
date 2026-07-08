package com.bytedance.android.livesdk.rank.api;

import X.C006A;
import X.C07UB;
import X.C1119120fEE;
import X.C188000nu;
import X.C2029207xC;
import X.InterfaceC211300rf;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.rank.impl.list.OfflineRankListFragment;
import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingFragment;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragmentSheet;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes18.dex */
public interface IRankService extends C006A {
    View AH1(ViewParent viewParent);

    Class<? extends LiveRecyclableWidget> BC0();

    long GS1();

    boolean I00(int i);

    long Ig0(int i);

    void It1();

    PreviewRankingSettingFragmentSheet LV();

    void OJ(long j, long j2, int i, int i2, Fragment fragment, InterfaceC211300rf interfaceC211300rf);

    void Tj2(View view);

    void Tn1(int i);

    int WS1();

    AnchorRankingSettingFragment Wq0(int i);

    boolean XD2();

    C1119120fEE XI2();

    LiveDialogFragment YP(int i, int i2, String str, String str2);

    void Zk();

    void bZ1(long j, long j2, C2029207xC c2029207xC);

    LiveDialogFragment dC(int i, int i2, String str, String str2, boolean z);

    C07UB et2();

    int hD0();

    Class<? extends LiveRecyclableWidget> jm1(boolean z);

    void l82();

    void oA(DataChannel dataChannel, String str);

    String po2();

    OfflineRankListFragment ti0();

    C188000nu xI2(Context context, DataChannel dataChannel);

    void yu();

    int yy2();
}
