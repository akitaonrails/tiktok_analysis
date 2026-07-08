package com.ss.android.ugc.aweme;

import X.AbstractC20656215sG;
import X.AbstractC738140SxQ;
import X.C0P0T;
import X.C11NJ;
import X.C13IQ;
import X.C19EG;
import X.C2344009Gk;
import X.C705930RmZ;
import X.InterfaceC1581620rGC;
import X.InterfaceC1617760sCU;
import X.InterfaceC19578611iq;
import X.InterfaceC19597711lv;
import X.InterfaceC19625011qK;
import X.InterfaceC19632111rT;
import X.InterfaceC19632811ra;
import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public interface IToolsBusinessService {
    void dismissStoryInnerSocialStickerBubble();

    InterfaceC1581620rGC getAvApiFragmentObserver(InterfaceC1617760sCU interfaceC1617760sCU);

    AbstractC20656215sG getRestoreWorkPopTask(String str, C19EG c19eg, LifecycleOwner lifecycleOwner);

    C13IQ<? extends AbstractC738140SxQ> getTikToktoolsAssem();

    C13IQ<? extends AbstractC738140SxQ> getToolsActivityAssem();

    InterfaceC19578611iq produceAttributionLinkStickerClickListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg);

    InterfaceC19578611iq produceCommentStickerClickListener(Context context, C705930RmZ c705930RmZ, C19EG c19eg);

    InterfaceC19578611iq produceDonationStickerClickListener(Context context, C705930RmZ c705930RmZ);

    InterfaceC19578611iq produceEmojiSliderGestureListener(Context context, C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, boolean z, ViewGroup viewGroup, Function1<? super Boolean, Unit> function1, boolean z2);

    InterfaceC19578611iq produceInteractiveEmojiClickListener(Context context, C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, boolean z, Function1<? super String, Unit> function1);

    InterfaceC19578611iq produceLiveCountDownStickerClickListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg);

    InterfaceC19625011qK produceLiveEventCountDownStickerListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg, boolean z, Function0<String> function0);

    InterfaceC19578611iq produceLocationStickerClickListener(Context context, C705930RmZ c705930RmZ);

    InterfaceC19578611iq produceMusicStickerClickListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg);

    InterfaceC19632811ra producePollDetailSaveData();

    InterfaceC19632111rT producePollStickerClickListener(boolean z, Context context, C705930RmZ c705930RmZ, C19EG c19eg, InterfaceC19632811ra interfaceC19632811ra, C11NJ c11nj);

    InterfaceC19578611iq produceShare2StoryPhotoStickerClickListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg);

    InterfaceC19578611iq produceSharedCommentStickerListener(C19EG c19eg, Aweme aweme);

    InterfaceC19578611iq produceSocialAvatarClickListener(C705930RmZ c705930RmZ, C19EG c19eg, Aweme aweme, ViewGroup viewGroup, boolean z, FragmentManager fragmentManager);

    InterfaceC19578611iq produceSocialStickerClickListener(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg, Function2<? super C2344009Gk, ? super Aweme, Unit> function2, InterfaceC19597711lv interfaceC19597711lv, boolean z);

    void showTip(C19EG c19eg, InteractStickerStruct interactStickerStruct, PointF pointF, int i, Function1<? super C0P0T, Unit> function1, Function0<Unit> function0);
}
