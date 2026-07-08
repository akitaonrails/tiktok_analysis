package com.ss.android.ugc.aweme.poi.uiwidget;

import X.C03IJ;
import X.C1190040h4c;
import X.C1191010h6B;
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
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
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
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiReviewGalleryAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewHelpfulAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1191010h6B.class, "PoiReviewHelpfulHierarchyData"), checkSupervisorPrepared());
    public C197039127h LLJ;
    public final AssemVMLazy LLJI;
    public final JSEventCenter LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewHelpfulAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/uiwidget/PoiReviewHelpfulVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewHelpfulAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewHelpfulVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2069), AFwS256S0000000_18.get$arr$(696), null, true);
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
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0h5W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1190560h5S) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 176), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0h5X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1190560h5S) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 177), 6);
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS153S0100000_18(this, 108));
        }
    }

    public final C1191010h6B Go() {
        return (C1191010h6B) this.LLIZLLLIL.getValue();
    }

    public final PoiReviewHelpfulVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiReviewHelpfulVM) assemVMLazy.getValue();
    }

    public final void Jo(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String reviewId;
        String string;
        String str;
        PoiReviewsApi.PoiReviewUserStatusModel userStatus;
        PoiReviewsApi.PoiReviewStatisticsModel statistics;
        Long l;
        PoiReviewsApi.PoiReviewModel poiReviewModelCopy = null;
        PoiReviewGalleryAbility poiReviewGalleryAbility = (PoiReviewGalleryAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), PoiReviewGalleryAbility.class, null);
        if (poiReviewGalleryAbility != null) {
            poiReviewGalleryAbility.RE1(poiReviewModel);
        }
        JSEventCenter jSEventCenter = this.LLJIJIL;
        JSONObject jSONObject = new JSONObject();
        if (poiReviewModel != null) {
            reviewId = poiReviewModel.getReviewId();
        } else {
            reviewId = null;
        }
        jSONObject.put("review_id", reviewId);
        if (poiReviewModel != null && (statistics = poiReviewModel.getStatistics()) != null && (l = statistics.likeCount) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        jSONObject.put("like_num", string);
        if (poiReviewModel != null && (userStatus = poiReviewModel.getUserStatus()) != null && Intrinsics.LJFF(userStatus.liked, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("like_status", str);
        jSEventCenter.JG1("poi_review_like", jSONObject);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        String str2 = Go().LLILLL;
        String str3 = Go().LLILZ;
        if (poiReviewModel != null) {
            poiReviewModelCopy = poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI);
        }
        eventBusLIZLLL.LJIILL(new C1190040h4c(str2, str3, poiReviewModelCopy));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        PoiReviewHelpfulVM poiReviewHelpfulVMHo = Ho();
        C1191010h6B c1191010h6BGo = Go();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status_");
        sbLIZ.append(c1191010h6BGo.LLILLJJLI);
        sbLIZ.append("_liked_");
        sbLIZ.append(c1191010h6BGo.LL);
        C2188811AlT.LIZIZ(sbLIZ);
        poiReviewHelpfulVMHo.setState(new AwS597S0100000_18(c1191010h6BGo, 677));
    }
}
