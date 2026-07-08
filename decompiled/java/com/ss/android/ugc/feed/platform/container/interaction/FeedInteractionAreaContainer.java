package com.ss.android.ugc.feed.platform.container.interaction;

import X.C08MH;
import X.C0HHT;
import X.C0RAD;
import X.C0RID;
import X.C0RIU;
import X.C0RIV;
import X.C0RIX;
import X.C0RQ6;
import X.C0SXF;
import X.C13LE;
import X.C1492110ovp;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2219251BtT;
import X.C300980Bqy;
import X.C303940Bvk;
import X.C418440Gaw;
import X.C693590RIn;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoAreaContainer;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedInteractionAreaContainer extends BaseContainer<VContainerProtocol, FeedInteractionAreaContainer> {
    public static final C0RAD LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final InterfaceC1731706qJ LLJL;
    public final FeedInfoAreaContainer LLJLIL;
    public final C0RQ6 LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0RAD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedInteractionAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLL = new Object() { // from class: X.0RAD
        };
    }

    public FeedInteractionAreaContainer() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C0RID(c19719912DlLIZ), null, new C0RIU());
        this.LLJLIL = new FeedInfoAreaContainer();
        this.LLJLILLLLZIIL = C0RQ6.FEED_INTERACTION_AREA_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC694120RKo
    public final void J4() {
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        super.J4();
        C693590RIn.LIZ(this, new C0RIV(this));
        FeedInfoAreaContainer feedInfoAreaContainer = this.LLJLIL;
        feedInfoAreaContainer.getClass();
        C1492110ovp.LIZIZ("FeedBottomButtonContainer", new C08MH(new C0RIX(feedInfoAreaContainer)), ((Boolean) C2219251BtT.LJFF.getValue()).booleanValue());
        if (!Bo() || LJJIJL() == null || (context = getContext()) == null || C0SXF.LJIL(context)) {
            return;
        }
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJLLIL;
        Object value = interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]);
        View viewFindViewById = LJJIJL().findViewById(R.id.yeg);
        value.getClass();
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (C300980Bqy.LIZ() || C303940Bvk.LIZ() || LowScreenOptimizeAB.LIZLLL()) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                int marginStart = marginLayoutParams3.getMarginStart();
                int i = marginLayoutParams3.topMargin;
                int marginEnd = marginLayoutParams3.getMarginEnd();
                marginLayoutParams3.setMarginStart(marginStart);
                marginLayoutParams3.topMargin = i;
                marginLayoutParams3.setMarginEnd(marginEnd);
                marginLayoutParams3.bottomMargin = iLIZIZ;
            } else {
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                int marginStart2 = marginLayoutParams3.getMarginStart();
                int i2 = marginLayoutParams3.topMargin;
                int marginEnd2 = marginLayoutParams3.getMarginEnd();
                marginLayoutParams3.setMarginStart(marginStart2);
                marginLayoutParams3.topMargin = i2;
                marginLayoutParams3.setMarginEnd(marginEnd2);
                marginLayoutParams3.bottomMargin = iLIZIZ2;
            }
        }
        Object value2 = this.LLJL.getValue(this, interfaceC2217461BqaArr[0]);
        View viewFindViewById2 = LJJIJL().findViewById(R.id.kvd);
        value2.getClass();
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            int marginStart3 = marginLayoutParams2.getMarginStart();
            int i3 = marginLayoutParams2.topMargin;
            int marginEnd3 = marginLayoutParams2.getMarginEnd();
            marginLayoutParams2.setMarginStart(marginStart3);
            marginLayoutParams2.topMargin = i3;
            marginLayoutParams2.setMarginEnd(marginEnd3);
            marginLayoutParams2.bottomMargin = 0;
        }
        Object value3 = this.LLJL.getValue(this, interfaceC2217461BqaArr[0]);
        View viewFindViewById3 = LJJIJL().findViewById(R.id.vlf);
        value3.getClass();
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
            return;
        }
        if (C303940Bvk.LIZ() || LowScreenOptimizeAB.LIZ()) {
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            int marginStart4 = marginLayoutParams.getMarginStart();
            int i4 = marginLayoutParams.topMargin;
            int marginEnd4 = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart4);
            marginLayoutParams.topMargin = i4;
            marginLayoutParams.setMarginEnd(marginEnd4);
            marginLayoutParams.bottomMargin = iLIZIZ3;
            return;
        }
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int marginStart5 = marginLayoutParams.getMarginStart();
        int i5 = marginLayoutParams.topMargin;
        int marginEnd5 = marginLayoutParams.getMarginEnd();
        marginLayoutParams.setMarginStart(marginStart5);
        marginLayoutParams.topMargin = i5;
        marginLayoutParams.setMarginEnd(marginEnd5);
        marginLayoutParams.bottomMargin = iLIZIZ4;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLJLILLLLZIIL;
    }
}
