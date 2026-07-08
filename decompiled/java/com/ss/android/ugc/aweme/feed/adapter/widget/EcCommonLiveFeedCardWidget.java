package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C183F;
import X.C183S;
import X.C188K;
import X.C19252910Tv;
import X.C1ACA;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.other.ECAutoOpenBagFromFYPSettings;
import com.bytedance.android.livesdk.livesetting.other.ECAutoOpenPdpFromFYPSettings;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.OecLivePreviewRoomData;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCardInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class EcCommonLiveFeedCardWidget extends BaseEcLiveFeedCardWidget {
    public final String LLJJI = "EcCommonLiveFeedCardWidget";
    public final C183S LLJJIII;

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget, com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.188M] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final void Q1() {
        C188K c188k = this.LLJILJIL;
        if (c188k == null || c188k.isDestroyed()) {
            C183S c183s = this.LLJJIII;
            this.LLJILJIL = c183s != 0 ? c183s.LIZJ(R1(), W1(), ECAutoOpenBagFromFYPSettings.INSTANCE.isEnable(), ECAutoOpenPdpFromFYPSettings.INSTANCE.isEnable(), new C183F() { // from class: X.188M
                @Override // X.C183F
                public final void LIZIZ() {
                }

                @Override // X.C183F
                public final void LIZ() {
                    MutableLiveData<Integer> mutableLiveData;
                    String strLIZLLL;
                    FeedLiveViewHolderVM feedLiveViewHolderVMS1;
                    MutableLiveData<String> mutableLiveData2;
                    C188K c188k2 = this.LIZ.LLJILJIL;
                    if (c188k2 != null && (strLIZLLL = c188k2.LIZLLL()) != null && (feedLiveViewHolderVMS1 = this.LIZ.S1()) != null && (mutableLiveData2 = feedLiveViewHolderVMS1.LLLF) != null) {
                        mutableLiveData2.setValue(strLIZLLL);
                    }
                    FeedLiveViewHolderVM feedLiveViewHolderVMS12 = this.LIZ.S1();
                    if (feedLiveViewHolderVMS12 == null || (mutableLiveData = feedLiveViewHolderVMS12.LLJLLIL) == null) {
                        return;
                    }
                    mutableLiveData.setValue(2);
                }

                @Override // X.C183F
                public final void onDismiss() {
                    Set<EnumC999300c6y> set;
                    MutableLiveData<Integer> mutableLiveData;
                    C20441214yg.LIZIZ(this.LIZ.LLJJI, "product card dismiss");
                    C786410Ut5.LJZ(8, this.LIZ.R1());
                    FeedLiveViewHolderVM feedLiveViewHolderVMS1 = this.LIZ.S1();
                    if (feedLiveViewHolderVMS1 != null && (mutableLiveData = feedLiveViewHolderVMS1.LLJLLIL) != null) {
                        mutableLiveData.setValue(0);
                    }
                    C1ACA c1acaZ1 = this.LIZ.z1();
                    if (c1acaZ1 == null || (set = c1acaZ1.LJLJL) == null) {
                        return;
                    }
                    EnumC999300c6y enumC999300c6y = BaseEcLiveFeedCardWidget.LLJJ;
                    set.remove(BaseEcLiveFeedCardWidget.LLJJ);
                }

                @Override // X.C183F
                public final void onShow() {
                    Set<EnumC999300c6y> set;
                    MutableLiveData<Boolean> mutableLiveData;
                    C786410Ut5.LJZ(0, this.LIZ.R1());
                    FeedLiveViewHolderVM feedLiveViewHolderVMS1 = this.LIZ.S1();
                    if (feedLiveViewHolderVMS1 != null && (mutableLiveData = feedLiveViewHolderVMS1.LLJZIJLIL) != null) {
                        mutableLiveData.setValue(Boolean.TRUE);
                    }
                    C20441214yg.LIZIZ(this.LIZ.LLJJI, "product card show");
                    C999370c75 c999370c75 = C999370c75.LIZ;
                    EnumC999300c6y enumC999300c6y = BaseEcLiveFeedCardWidget.LLJJ;
                    C1ACA c1acaZ1 = this.LIZ.z1();
                    c999370c75.getClass();
                    C999370c75.LIZLLL(enumC999300c6y, c1acaZ1);
                    C1ACA c1acaZ12 = this.LIZ.z1();
                    if (c1acaZ12 == null || (set = c1acaZ12.LJLJL) == null) {
                        return;
                    }
                    set.add(enumC999300c6y);
                }
            }, new AwS611S0100000_32(this, 72), new AwS576S0100000_32(this, 184), new AwS576S0100000_32(this, 185)) : null;
        }
    }

    public EcCommonLiveFeedCardWidget() {
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        this.LLJJIII = iEcommerceLiveService != null ? iEcommerceLiveService.LJJIZ() : null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final FrameLayout P1() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mwu);
        C19252910Tv.LIZIZ.LIZLLL().LJFF().LIZIZ(frameLayout);
        return frameLayout;
    }

    public final Integer W1() {
        LiveRoomStruct liveRoomStruct;
        FYPCommerceStruct fYPCommerceStruct;
        OecLivePreviewRoomData oecLivePreviewRoomDataObject;
        PreviewCardInfo previewCardInfo;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || (fYPCommerceStruct = liveRoomStruct.fypCommerceStruct) == null || (oecLivePreviewRoomDataObject = fYPCommerceStruct.getOecLivePreviewRoomDataObject()) == null || (previewCardInfo = oecLivePreviewRoomDataObject.previewCardInfo) == null) {
            return null;
        }
        return previewCardInfo.cardType;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final String T1() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final boolean O1(LiveRoomStruct liveRoomStruct) {
        C183S c183s = this.LLJJIII;
        if (c183s != null) {
            return c183s.LIZ(liveRoomStruct);
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final void V1(C188K c188k, boolean z) {
        LiveRoomStruct liveRoomStruct;
        String str;
        Aweme aweme;
        C183S c183s = this.LLJJIII;
        if (c183s != null) {
            Context context = this.context;
            C1ACA c1acaZ1 = z1();
            String requestId = null;
            if (c1acaZ1 != null) {
                liveRoomStruct = c1acaZ1.LIZJ;
            } else {
                liveRoomStruct = null;
            }
            Integer numW1 = W1();
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null) {
                str = c1acaZ12.LIZLLL;
            } else {
                str = null;
            }
            boolean zLIZ = C19252910Tv.LIZIZ.LIZLLL().LJFF().LIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && (aweme = c1acaZ13.LIZIZ) != null) {
                requestId = aweme.getRequestId();
            }
            linkedHashMap.put("request_id", requestId);
            c183s.LIZIZ(context, c188k, liveRoomStruct, numW1, str, zLIZ, z, linkedHashMap);
        }
    }
}
