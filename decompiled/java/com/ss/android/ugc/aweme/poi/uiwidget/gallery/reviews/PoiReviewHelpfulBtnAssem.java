package com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews;

import X.C03IJ;
import X.C1190040h4c;
import X.C1191380h6m;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1191110h6L;
import X.EnumC1191410h6p;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.manager.JSEventCenter;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewHelpfulBtnAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1191380h6m.class, "PoiReviewHelpfulBtnHierarchyData"), checkSupervisorPrepared());
    public C197039127h LLJ;
    public final AssemVMLazy LLJI;
    public final JSEventCenter LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewHelpfulBtnAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/uiwidget/gallery/reviews/PoiReviewHelpfulVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewHelpfulBtnAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewHelpfulVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2076), AFwS256S0000000_18.get$arr$(716), null, true);
        this.LLJIJIL = new JSEventCenter(false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C197039127h c197039127h;
        super.onCreate();
        this.LLJ = (C197039127h) LJJIJL().findViewById(R.id.jlr);
        Context context = getContext();
        if (context != null && (c197039127h = this.LLJ) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zj, context);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c197039127h.setBackground(c384050F3z.LIZ(context));
        }
        JSEventCenter jSEventCenter = this.LLJIJIL;
        LifecycleRegistry lifecycle = getLifecycle();
        jSEventCenter.getClass();
        lifecycle.addObserver(jSEventCenter);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0h6x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1191400h6o) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 178), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0h6w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1191400h6o) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 179), 6);
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS153S0100000_18(this, 111));
        }
    }

    public final C1191380h6m Go() {
        return (C1191380h6m) this.LLIZLLLIL.getValue();
    }

    public final PoiReviewHelpfulVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiReviewHelpfulVM) assemVMLazy.getValue();
    }

    public final void Jo(PoiReviewsGalleryData poiReviewsGalleryData) {
        String str;
        String string;
        String str2;
        String str3;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel2;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel2;
        Long l;
        PoiReviewGalleryAbility poiReviewGalleryAbility = (PoiReviewGalleryAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), PoiReviewGalleryAbility.class, null);
        if (poiReviewGalleryAbility != null) {
            poiReviewGalleryAbility.K61(poiReviewsGalleryData);
        }
        JSEventCenter jSEventCenter = this.LLJIJIL;
        JSONObject jSONObject = new JSONObject();
        if (poiReviewsGalleryData != null) {
            str = poiReviewsGalleryData.reviewId;
        } else {
            str = null;
        }
        jSONObject.put("review_id", str);
        if (poiReviewsGalleryData != null && (poiReviewStatisticsModel2 = poiReviewsGalleryData.statistics) != null && (l = poiReviewStatisticsModel2.likeCount) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        jSONObject.put("like_num", string);
        if (poiReviewsGalleryData != null && (poiReviewUserStatusModel2 = poiReviewsGalleryData.userStatus) != null && Intrinsics.LJFF(poiReviewUserStatusModel2.liked, Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("like_status", str2);
        jSEventCenter.JG1("poi_review_like", jSONObject);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (poiReviewsGalleryData != null) {
            str3 = poiReviewsGalleryData.reviewId;
        } else {
            str3 = null;
        }
        if (poiReviewsGalleryData != null) {
            poiReviewStatisticsModel = poiReviewsGalleryData.statistics;
            poiReviewUserStatusModel = poiReviewsGalleryData.userStatus;
        } else {
            poiReviewStatisticsModel = null;
            poiReviewUserStatusModel = null;
        }
        eventBusLIZLLL.LJIILL(new C1190040h4c(str3, null, new PoiReviewsApi.PoiReviewModel(null, null, null, null, null, poiReviewStatisticsModel, poiReviewUserStatusModel, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, EnumC1191110h6L.DEFAULT, null, String.valueOf(System.currentTimeMillis()), false, null)));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC1191410h6p enumC1191410h6p;
        super.onViewCreated(view);
        PoiReviewHelpfulVM poiReviewHelpfulVMHo = Ho();
        C1191380h6m c1191380h6mGo = Go();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status_");
        Long l = null;
        if (c1191380h6mGo != null) {
            enumC1191410h6p = c1191380h6mGo.LLILLJJLI;
        } else {
            enumC1191410h6p = null;
        }
        sbLIZ.append(enumC1191410h6p);
        sbLIZ.append("_liked_");
        if (c1191380h6mGo != null) {
            l = c1191380h6mGo.LL;
        }
        sbLIZ.append(l);
        C2188811AlT.LIZIZ(sbLIZ);
        poiReviewHelpfulVMHo.setState(new AwS597S0100000_18(c1191380h6mGo, 804));
    }
}
