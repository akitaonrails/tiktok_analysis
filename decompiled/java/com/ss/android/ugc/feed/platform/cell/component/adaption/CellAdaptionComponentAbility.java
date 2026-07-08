package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.C1387230mCf;
import X.C690990R8n;
import X.InterfaceC1058490deR;
import X.InterfaceC1294060jmO;
import X.InterfaceC20561815d2;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;

/* JADX INFO: loaded from: classes12.dex */
public interface CellAdaptionComponentAbility extends InterfaceC494301wD {
    @InterfaceC1294060jmO
    void CX1(Context context, Aweme aweme, View view, View view2, OcrLocation ocrLocation, ViewGroup viewGroup);

    void Ct2(String str, Integer num, Integer num2, View... viewArr);

    boolean DP1();

    @InterfaceC1294060jmO
    C690990R8n FF0(Context context, Aweme aweme, OcrLocation ocrLocation, ViewGroup viewGroup);

    @InterfaceC1294060jmO
    void FH1(Context context, Aweme aweme, View view, OcrLocation ocrLocation, ViewGroup viewGroup);

    @InterfaceC1294060jmO
    void M72(Context context, View view, Integer num, Integer num2, ViewGroup viewGroup, Aweme aweme);

    AdaptionPaddingValues Ns0();

    int Sj0();

    boolean XG1();

    void XX0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2);

    boolean YP0();

    boolean ZY1(boolean z);

    void aW0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2, boolean z);

    InterfaceC1058490deR dj2();

    boolean fk1();

    View jj1();

    AdaptionPaddingValues n81();

    C1387230mCf tK1();

    AdaptionPaddingValues vk1();

    VideoAdaptionResult wB2();

    VideoAdaptionResult yc2();
}
