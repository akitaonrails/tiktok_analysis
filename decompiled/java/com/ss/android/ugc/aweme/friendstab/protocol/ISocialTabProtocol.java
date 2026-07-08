package com.ss.android.ugc.aweme.friendstab.protocol;

import X.C06KX;
import X.EnumC1583290rIt;
import X.InterfaceC1571780r0K;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;

/* JADX INFO: loaded from: classes25.dex */
public interface ISocialTabProtocol extends C06KX {
    void B3();

    void EP2(EnumC1583290rIt enumC1583290rIt);

    void Gu1();

    void L();

    void LIZIZ();

    Class<? extends Fragment> LLJIJIL();

    void OM1(String str);

    Bundle V9(Context context);

    void ZA1(int i, boolean z);

    void aw0();

    void d21(SocialFeedRedDotResponse socialFeedRedDotResponse);

    boolean enable();

    InterfaceC1571780r0K fK();

    String getMob();

    String getTag();

    void init(Context context);

    boolean isLoading();

    String mc(Context context);

    void onTouchEvent(MotionEvent motionEvent);
}
