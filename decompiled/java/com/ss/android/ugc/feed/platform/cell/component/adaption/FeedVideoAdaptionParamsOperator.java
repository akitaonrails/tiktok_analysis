package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.AbstractC1879030yzt;
import X.AbstractC20560715cr;
import X.C013C;
import X.C01GW;
import X.C1697810uHb;
import X.C1866580yfo;
import X.C1914407eg;
import X.C20479115Bl;
import X.C20479315Bn;
import X.C20479515Bp;
import X.C20479615Bq;
import X.C20479715Br;
import X.C20479815Bs;
import X.C20479915Bt;
import X.C20480015Bu;
import X.C20480115Bv;
import X.C20555515c1;
import X.C20555615c2;
import X.C20555715c3;
import X.C20555815c4;
import X.C20555915c5;
import X.C20556215c8;
import X.C20565515dd;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C998520c5i;
import X.EnumC1910950zpN;
import X.EnumC20563615dK;
import X.InterfaceC1874070yrt;
import X.InterfaceC20559915cj;
import X.InterfaceC20560115cl;
import X.InterfaceC20566015di;
import X.InterfaceC20566915dr;
import X.InterfaceC20568315e5;
import X.InterfaceC497601wk;
import X.InterfaceC582290Msd;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedVideoAdaptionParamsOperator implements InterfaceC20559915cj, InterfaceC20566915dr, InterfaceC20568315e5, InterfaceC20560115cl, InterfaceC20566015di, InterfaceC582290Msd {
    public final List<Integer> containerAlignTypes;
    public final boolean containerAvoidTopBar;
    public final List<Float> containerBlackEdgeRates;
    public final transient int containerHeight;
    public final C01GW containerThresholds$delegate;
    public final transient int containerWidth;
    public final boolean cropVideoTypeCheck;
    public final transient int duration;
    public final transient C20479115Bl effectiveArea;
    public final transient C01GW effectiveStickerAreas$delegate;
    public final boolean enableMultiContainer;
    public final boolean enableSmartCrop;
    public final String eventType;
    public final InterfaceC1874070yrt feedScreenContext;
    public final EnumC20563615dK forceScaleType;
    public final transient InteractInfoAreaAttachAbility infoAreaAttachAbility;
    public final transient List<InteractStickerStruct> interactStickerStructs;
    public final transient C20479115Bl obstructedArea;
    public final transient C01GW obstructedInteractAreas$delegate;
    public final transient InteractRightAreaAttachAbility rightAreaAttachAbility;
    public final C20556215c8 scaleInfo;
    public final transient AbstractC20560715cr screenAdaptionManager;
    public static final C20555915c5 Companion = new C20555915c5();
    public static final int $stable = 8;
    public static final C01GW<InterfaceC497601wk> scope$delegate = C452501pT.LIZIZ(new C998520c5i());
    public static final int tRectBMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final C01GW<Integer> rRectTMargin$delegate = C452501pT.LIZIZ(new C20480015Bu());
    public static final C01GW<Integer> rRectLMargin$delegate = C452501pT.LIZIZ(new C20479915Bt());
    public static final C01GW<Integer> lRectMargin$delegate = C452501pT.LIZIZ(new C20479615Bq());
    public static final int margin8 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int avatarSize = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final C01GW<Integer> rRectWidth$delegate = C452501pT.LIZIZ(new C20480115Bv());
    public static final C01GW<Integer> rRectHeight$delegate = C452501pT.LIZIZ(new C20479815Bs());
    public static final int lRectHeight = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
    public static final C01GW<Integer> lRectRMargin$delegate = C452501pT.LIZIZ(new C20479715Br());

    private final InteractInfoAreaAttachAbility component10() {
        return this.infoAreaAttachAbility;
    }

    private final AbstractC20560715cr component11() {
        return this.screenAdaptionManager;
    }

    private final int component12() {
        return this.containerHeight;
    }

    private final int component13() {
        return this.containerWidth;
    }

    private final C20479115Bl component14() {
        return this.obstructedArea;
    }

    private final C20479115Bl component15() {
        return this.effectiveArea;
    }

    private final int component16() {
        return this.duration;
    }

    private final String component6() {
        return this.eventType;
    }

    private final List<InteractStickerStruct> component8() {
        return this.interactStickerStructs;
    }

    private final InteractRightAreaAttachAbility component9() {
        return this.rightAreaAttachAbility;
    }

    public final FeedVideoAdaptionParamsOperator copy(EnumC20563615dK enumC20563615dK, C20556215c8 c20556215c8, boolean z, boolean z2, boolean z3, String str, InterfaceC1874070yrt interfaceC1874070yrt, List<? extends InteractStickerStruct> list, InteractRightAreaAttachAbility interactRightAreaAttachAbility, InteractInfoAreaAttachAbility interactInfoAreaAttachAbility, AbstractC20560715cr abstractC20560715cr, int i, int i2, C20479115Bl c20479115Bl, C20479115Bl c20479115Bl2, int i3) {
        return new FeedVideoAdaptionParamsOperator(enumC20563615dK, c20556215c8, z, z2, z3, str, interfaceC1874070yrt, list, interactRightAreaAttachAbility, interactInfoAreaAttachAbility, abstractC20560715cr, i, i2, c20479115Bl, c20479115Bl2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedVideoAdaptionParamsOperator)) {
            return false;
        }
        FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator = (FeedVideoAdaptionParamsOperator) obj;
        return this.forceScaleType == feedVideoAdaptionParamsOperator.forceScaleType && Intrinsics.LJFF(this.scaleInfo, feedVideoAdaptionParamsOperator.scaleInfo) && this.enableSmartCrop == feedVideoAdaptionParamsOperator.enableSmartCrop && this.cropVideoTypeCheck == feedVideoAdaptionParamsOperator.cropVideoTypeCheck && this.enableMultiContainer == feedVideoAdaptionParamsOperator.enableMultiContainer && Intrinsics.LJFF(this.eventType, feedVideoAdaptionParamsOperator.eventType) && Intrinsics.LJFF(this.feedScreenContext, feedVideoAdaptionParamsOperator.feedScreenContext) && Intrinsics.LJFF(this.interactStickerStructs, feedVideoAdaptionParamsOperator.interactStickerStructs) && Intrinsics.LJFF(this.rightAreaAttachAbility, feedVideoAdaptionParamsOperator.rightAreaAttachAbility) && Intrinsics.LJFF(this.infoAreaAttachAbility, feedVideoAdaptionParamsOperator.infoAreaAttachAbility) && Intrinsics.LJFF(this.screenAdaptionManager, feedVideoAdaptionParamsOperator.screenAdaptionManager) && this.containerHeight == feedVideoAdaptionParamsOperator.containerHeight && this.containerWidth == feedVideoAdaptionParamsOperator.containerWidth && Intrinsics.LJFF(this.obstructedArea, feedVideoAdaptionParamsOperator.obstructedArea) && Intrinsics.LJFF(this.effectiveArea, feedVideoAdaptionParamsOperator.effectiveArea) && this.duration == feedVideoAdaptionParamsOperator.duration;
    }

    public int hashCode() {
        EnumC20563615dK enumC20563615dK = this.forceScaleType;
        int iHashCode = (enumC20563615dK == null ? 0 : enumC20563615dK.hashCode()) * 31;
        C20556215c8 c20556215c8 = this.scaleInfo;
        int iHashCode2 = (((((((((iHashCode + (c20556215c8 == null ? 0 : c20556215c8.hashCode())) * 31) + C786410Ut5.Z2(this.enableSmartCrop)) * 31) + C786410Ut5.Z2(this.cropVideoTypeCheck)) * 31) + C786410Ut5.Z2(this.enableMultiContainer)) * 31) + this.eventType.hashCode()) * 31;
        InterfaceC1874070yrt interfaceC1874070yrt = this.feedScreenContext;
        int iHashCode3 = (iHashCode2 + (interfaceC1874070yrt == null ? 0 : interfaceC1874070yrt.hashCode())) * 31;
        List<InteractStickerStruct> list = this.interactStickerStructs;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        InteractRightAreaAttachAbility interactRightAreaAttachAbility = this.rightAreaAttachAbility;
        int iHashCode5 = (iHashCode4 + (interactRightAreaAttachAbility == null ? 0 : interactRightAreaAttachAbility.hashCode())) * 31;
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = this.infoAreaAttachAbility;
        int iHashCode6 = (iHashCode5 + (interactInfoAreaAttachAbility == null ? 0 : interactInfoAreaAttachAbility.hashCode())) * 31;
        AbstractC20560715cr abstractC20560715cr = this.screenAdaptionManager;
        int iHashCode7 = (((((iHashCode6 + (abstractC20560715cr == null ? 0 : abstractC20560715cr.hashCode())) * 31) + this.containerHeight) * 31) + this.containerWidth) * 31;
        C20479115Bl c20479115Bl = this.obstructedArea;
        int iHashCode8 = (iHashCode7 + (c20479115Bl == null ? 0 : c20479115Bl.hashCode())) * 31;
        C20479115Bl c20479115Bl2 = this.effectiveArea;
        return ((iHashCode8 + (c20479115Bl2 != null ? c20479115Bl2.hashCode() : 0)) * 31) + this.duration;
    }

    public final List<C20565515dd> calOcclusions() {
        AbstractC20560715cr abstractC20560715cr;
        ScreenAdaptionResult screenAdaptionResult;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        if (this.containerHeight <= 0 || this.containerWidth <= 0 || (abstractC20560715cr = this.screenAdaptionManager) == null || (screenAdaptionResult = (ScreenAdaptionResult) abstractC20560715cr.LLILZ) == null) {
            return null;
        }
        int statusBarHeight = screenAdaptionResult.getStatusBarHeight() - screenAdaptionResult.getTopSpaceHeight();
        int appNavHeight = screenAdaptionResult.getAppNavHeight() - screenAdaptionResult.getBottomSpaceHeight();
        InteractRightAreaAttachAbility interactRightAreaAttachAbility = this.rightAreaAttachAbility;
        if (interactRightAreaAttachAbility == null || (rect = interactRightAreaAttachAbility.Zl()) == null) {
            rect = new Rect();
        }
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = this.infoAreaAttachAbility;
        if (interactInfoAreaAttachAbility == null || (rect2 = interactInfoAreaAttachAbility.Zl()) == null) {
            rect2 = new Rect();
        }
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility2 = this.infoAreaAttachAbility;
        if (interactInfoAreaAttachAbility2 == null || (rect3 = interactInfoAreaAttachAbility2.PR1()) == null) {
            rect3 = new Rect();
        }
        C013C c013c = new C013C();
        C013C c013c2 = new C013C();
        C013C c013c3 = new C013C();
        c013c.element = true;
        int i = this.containerWidth;
        C1914407eg.LIZ.getClass();
        Rect rect7 = new Rect(0, 0, i, (C1914407eg.LIZ() + statusBarHeight) - tRectBMargin);
        if (calOcclusions$invalid(rect)) {
            int i2 = this.containerWidth;
            Companion.getClass();
            rect4 = new Rect(i2 - rRectWidth$delegate.getValue().intValue(), this.containerHeight - (rRectHeight$delegate.getValue().intValue() + appNavHeight), this.containerWidth, this.containerHeight);
        } else {
            c013c2.element = true;
            float f = rect.left;
            int iWidth = rect.width();
            int i3 = avatarSize;
            Companion.getClass();
            rect4 = new Rect((int) (f + ((iWidth - i3) / 2.0f) + rRectLMargin$delegate.getValue().intValue()), (int) (rect.top + margin8 + ((rect.width() - i3) / 2.0f) + rRectTMargin$delegate.getValue().intValue()), this.containerWidth, this.containerHeight);
        }
        if (calOcclusions$invalid(rect2) || calOcclusions$invalid(rect3)) {
            int i4 = this.containerHeight - (appNavHeight + lRectHeight);
            int i5 = this.containerWidth;
            Companion.getClass();
            rect5 = new Rect(0, i4, i5 - lRectRMargin$delegate.getValue().intValue(), this.containerHeight);
            rect6 = new Rect();
        } else {
            c013c3.element = true;
            int i6 = rect2.top;
            Companion.getClass();
            C01GW<Integer> c01gw = lRectMargin$delegate;
            rect6 = new Rect(0, i6 + c01gw.getValue().intValue(), rect3.right / 2, this.containerHeight);
            rect5 = new Rect(0, rect3.top + c01gw.getValue().intValue(), rect3.right - (c01gw.getValue().intValue() * 2), this.containerHeight);
        }
        Companion.getClass();
        C23250099c.LIZLLL(scope$delegate.getValue(), null, null, new C20479315Bn(this, rect, rect2, rect3, rect7, c013c, rect4, c013c2, rect6, c013c3, rect5, null), 3);
        return C1697810uHb.LJIIJJI(new C20565515dd(new C20479515Bp(-1.0d, 0.0d, 0.0d, 1.0d), "left_edge"), new C20565515dd(new C20479515Bp(1.0d, 0.0d, 2.0d, 1.0d), "right_edge"), new C20565515dd(calOcclusions$toRelativeRect(rect7, this), "interact_top"), new C20565515dd(calOcclusions$toRelativeRect(rect4, this), "interact_right"), new C20565515dd(calOcclusions$toRelativeRect(rect6, this), "interact_left_up"), new C20565515dd(calOcclusions$toRelativeRect(rect5, this), "interact_left"));
    }

    @Override // X.InterfaceC20560115cl
    public List<Float> getContainerThresholds() {
        return (List) this.containerThresholds$delegate.getValue();
    }

    @Override // X.InterfaceC20559915cj
    public List<C20479515Bp> getEffectiveStickerAreas() {
        return (List) this.effectiveStickerAreas$delegate.getValue();
    }

    @Override // X.InterfaceC20559915cj
    public List<C20565515dd> getObstructedInteractAreas() {
        return (List) this.obstructedInteractAreas$delegate.getValue();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedVideoAdaptionParamsOperator(forceScaleType=");
        sbLIZ.append(getForceScaleType());
        sbLIZ.append(",isEnableSmartCrop=");
        sbLIZ.append(getEnableSmartCrop());
        sbLIZ.append(",cropVideoTypeCheck=");
        sbLIZ.append(this.cropVideoTypeCheck);
        sbLIZ.append(",enableMultiContainer=");
        sbLIZ.append(getEnableMultiContainer());
        sbLIZ.append(",eventType=");
        sbLIZ.append(this.eventType);
        sbLIZ.append(",containerThresholds=");
        sbLIZ.append(getContainerThresholds());
        sbLIZ.append(",containerAlignTypes=");
        sbLIZ.append(getContainerAlignTypes());
        sbLIZ.append(",containerFitBlackEdgeRate=");
        sbLIZ.append(getContainerBlackEdgeRates());
        sbLIZ.append(",)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20566015di
    public List<Integer> getContainerAlignTypes() {
        return this.containerAlignTypes;
    }

    @Override // X.InterfaceC20566015di
    public boolean getContainerAvoidTopBar() {
        return this.containerAvoidTopBar;
    }

    @Override // X.InterfaceC20566015di
    public List<Float> getContainerBlackEdgeRates() {
        return this.containerBlackEdgeRates;
    }

    public final boolean getCropVideoTypeCheck() {
        return this.cropVideoTypeCheck;
    }

    @Override // X.InterfaceC20568315e5
    public boolean getEnableMultiContainer() {
        return this.enableMultiContainer;
    }

    @Override // X.InterfaceC20568315e5
    public boolean getEnableSmartCrop() {
        return this.enableSmartCrop;
    }

    @Override // X.InterfaceC582290Msd
    public InterfaceC1874070yrt getFeedScreenContext() {
        return this.feedScreenContext;
    }

    @Override // X.InterfaceC20566915dr
    public EnumC20563615dK getForceScaleType() {
        return this.forceScaleType;
    }

    @Override // X.InterfaceC20566915dr
    public C20556215c8 getScaleInfo() {
        return this.scaleInfo;
    }

    public static final boolean calOcclusions$invalid(Rect rect) {
        if (rect.width() != 0 && rect.height() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List<X.15Bp>] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.15Bp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C20479515Bp> calStickerLocs(boolean r21) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator.calStickerLocs(boolean):java.util.List");
    }

    public static final C20479515Bp calOcclusions$toRelativeRect(Rect rect, FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator) {
        double d = rect.left;
        int i = feedVideoAdaptionParamsOperator.containerWidth;
        double d2 = d / ((double) i);
        double d3 = ((double) rect.right) / ((double) i);
        double d4 = rect.top;
        int i2 = feedVideoAdaptionParamsOperator.containerHeight;
        return new C20479515Bp(d2, d4 / ((double) i2), d3, ((double) rect.bottom) / ((double) i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeedVideoAdaptionParamsOperator(com.ss.android.ugc.aweme.feed.model.Aweme r19, boolean r20, int r21, int r22, X.AbstractC20560715cr r23, com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility r24, com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility r25, X.C20479115Bl r26, X.C20479115Bl r27, java.lang.String r28, X.InterfaceC1874070yrt r29) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, int, int, X.15cr, com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility, com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility, X.15Bl, X.15Bl, java.lang.String, X.0yrt):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedVideoAdaptionParamsOperator(EnumC20563615dK enumC20563615dK, C20556215c8 c20556215c8, boolean z, boolean z2, boolean z3, String str, InterfaceC1874070yrt interfaceC1874070yrt, List<? extends InteractStickerStruct> list, InteractRightAreaAttachAbility interactRightAreaAttachAbility, InteractInfoAreaAttachAbility interactInfoAreaAttachAbility, AbstractC20560715cr abstractC20560715cr, int i, int i2, C20479115Bl c20479115Bl, C20479115Bl c20479115Bl2, int i3) {
        List<Integer> list2;
        this.forceScaleType = enumC20563615dK;
        this.scaleInfo = c20556215c8;
        this.enableSmartCrop = z;
        this.cropVideoTypeCheck = z2;
        this.enableMultiContainer = z3;
        this.eventType = str;
        this.feedScreenContext = interfaceC1874070yrt;
        this.interactStickerStructs = list;
        this.rightAreaAttachAbility = interactRightAreaAttachAbility;
        this.infoAreaAttachAbility = interactInfoAreaAttachAbility;
        this.screenAdaptionManager = abstractC20560715cr;
        this.containerHeight = i;
        this.containerWidth = i2;
        this.obstructedArea = c20479115Bl;
        this.effectiveArea = c20479115Bl2;
        this.duration = i3;
        if (!getEnableSmartCrop()) {
            AbstractC1879030yzt.LIZJ(null, EnumC1910950zpN.FINISH, new Pair[]{new Pair("msg", new C20555815c4())});
        }
        this.obstructedInteractAreas$delegate = C452501pT.LIZIZ(new C20555715c3(this));
        this.effectiveStickerAreas$delegate = C452501pT.LIZIZ(new C20555615c2(this));
        this.containerThresholds$delegate = C452501pT.LIZIZ(new C20555515c1(this));
        if (getEnableMultiContainer()) {
            list2 = C1866580yfo.LIZ().multi_container_align_type_list;
        } else {
            list2 = null;
        }
        this.containerAlignTypes = list2;
        this.containerBlackEdgeRates = getEnableMultiContainer() ? C1866580yfo.LIZ().multi_containers_top_black_rate_list : null;
        this.containerAvoidTopBar = true;
    }
}
