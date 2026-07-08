package com.ss.android.ugc.aweme.viewmodel;

import X.C01GW;
import X.C0OFQ;
import X.C0OFR;
import X.C0OFS;
import X.C0W38;
import X.C123100dR;
import X.C13LE;
import X.C1489110oqz;
import X.C1843500y4a;
import X.C2097608Jq;
import X.C2217371BqR;
import X.C2344809Gs;
import X.C298410Bmp;
import X.C452501pT;
import X.C614430O8b;
import X.C616430OFt;
import X.C717590SCv;
import X.C721190SQr;
import X.C786410Ut5;
import X.C830490Whz;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC616440OFu;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import com.ss.android.ugc.aweme.favorites.agents.abilities.ICollect;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PostModeFavoriteViewModel extends AssemViewModel<C0OFR> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public Aweme LL;
    public C616430OFt LLILLJJLI;
    public final C717590SCv LLILLL;
    public long LLILZ;
    public String LLILZIL;
    public PostModeDetailParams LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(PostModeFavoriteViewModel.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OFR(0);
    }

    public PostModeFavoriteViewModel() {
        new C0OFQ(this);
        this.LLILLL = new C717590SCv(AFwS195S0000000_9.get$arr$(356));
        this.LLILZ = -1L;
        this.LLIZ = "";
        this.LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1607));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber((C0OFS) this.LLJ.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber((C0OFS) this.LLJ.getValue());
        }
    }

    public final void vQ2(Aweme aweme) {
        String strLIZIZ;
        if (aweme == null) {
            return;
        }
        long j = this.LLILZ;
        long j2 = 1;
        if (AwemeExtKt.isCollected(aweme)) {
            if (j > -1) {
                j2 = 1 + j;
            }
        } else if (j <= 0) {
            j2 = 0;
        } else {
            j2 = j - 1;
        }
        this.LLILZ = j2;
        try {
            strLIZIZ = C1843500y4a.LIZIZ(j2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            strLIZIZ = CardStruct.IStatusCode.DEFAULT;
        }
        setState(new AwS123S1100000_9(strLIZIZ, aweme, 3));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void wQ2(View view, InterfaceC616440OFu interfaceC616440OFu) {
        int i;
        int i2;
        C830490Whz c830490WhzLIZ;
        String str;
        Object aid;
        int awemeType;
        C830490Whz c830490WhzLIZ2;
        String str2;
        String string;
        String string2;
        String logExtra;
        Object obj;
        Map<String, ? extends Object> mapLJIIL;
        Long creativeId;
        Long adId;
        String string3;
        String string4;
        String logExtra2;
        Object obj2;
        Map<String, ? extends Object> mapLJIIL2;
        Long creativeId2;
        Long adId2;
        if (C298410Bmp.LIZ()) {
            Aweme aweme = this.LL;
            if (aweme != null) {
                Boolean boolLIZ = ((IAwemeCollectionState) ServiceManager.get().getService(IAwemeCollectionState.class)).LIZ(aweme);
                if (!Intrinsics.LJFF(boolLIZ, Boolean.valueOf(getState().LLILZ))) {
                    return;
                }
                AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(boolLIZ, 1608);
                if (C123100dR.LIZ(this.LLIZ)) {
                    c830490WhzLIZ2 = C0W38.LIZ(new Pair("action_from_page", this.LLIZ));
                } else {
                    c830490WhzLIZ2 = null;
                }
                if (!Intrinsics.LJFF(boolLIZ, Boolean.TRUE)) {
                    C721190SQr.LIZ.LJIJ(this.LL, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, c830490WhzLIZ2);
                    ICollect iCollect = (ICollect) ServiceManager.get().getService(ICollectAweme.class);
                    String aid2 = aweme.getAid();
                    if (!AwemeExtKt.isMonetizationTraffic(aweme)) {
                        mapLJIIL2 = C2097608Jq.LJ();
                    } else {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        Map<String, Object> mapLIZ = EngagementTraceImpl.LIZIZ().LIZ();
                        Pair[] pairArr = new Pair[7];
                        AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData != null && (adId2 = monetizationData.getAdId()) != null) {
                            string3 = adId2.toString();
                        } else {
                            string3 = null;
                        }
                        pairArr[0] = new Pair("ad_id", string3);
                        AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData2 != null && (creativeId2 = monetizationData2.getCreativeId()) != null) {
                            string4 = creativeId2.toString();
                        } else {
                            string4 = null;
                        }
                        pairArr[1] = new Pair("creative_id", string4);
                        AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData3 != null) {
                            logExtra2 = monetizationData3.getLogExtra();
                        } else {
                            logExtra2 = null;
                        }
                        pairArr[2] = new Pair("log_extra", logExtra2);
                        pairArr[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                        pairArr[4] = new Pair("access", C786410Ut5.b3(contextLIZ));
                        pairArr[5] = new Pair("package", contextLIZ.getPackageName());
                        android.util.Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(contextLIZ);
                        if (pairLIZ != null) {
                            obj2 = pairLIZ.first;
                        } else {
                            obj2 = null;
                        }
                        pairArr[6] = new Pair("google_aid", obj2);
                        mapLJIIL2 = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), mapLIZ);
                    }
                    iCollect.collect(aid2, mapLJIIL2, new AwS445S0200000_9(this, awS553S0100000_9, 19), new AwS445S0200000_9(view, this, 20));
                } else {
                    C721190SQr c721190SQr = C721190SQr.LIZ;
                    Aweme aweme2 = this.LL;
                    String str3 = this.LLILZIL;
                    PostModeDetailParams postModeDetailParams = this.LLILZLL;
                    if (postModeDetailParams != null) {
                        str2 = postModeDetailParams.exploreFromGroupId;
                    } else {
                        str2 = null;
                    }
                    c721190SQr.LJIILLIIL(aweme2, str3, str2, c830490WhzLIZ2);
                    ICollect iCollect2 = (ICollect) ServiceManager.get().getService(ICollectAweme.class);
                    String aid3 = aweme.getAid();
                    if (!AwemeExtKt.isMonetizationTraffic(aweme)) {
                        mapLJIIL = C2097608Jq.LJ();
                    } else {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ2 = C844470XAv.LIZ();
                        Map<String, Object> mapLIZ2 = EngagementTraceImpl.LIZIZ().LIZ();
                        Pair[] pairArr2 = new Pair[7];
                        AwemeRawAd monetizationData4 = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData4 != null && (adId = monetizationData4.getAdId()) != null) {
                            string = adId.toString();
                        } else {
                            string = null;
                        }
                        pairArr2[0] = new Pair("ad_id", string);
                        AwemeRawAd monetizationData5 = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData5 != null && (creativeId = monetizationData5.getCreativeId()) != null) {
                            string2 = creativeId.toString();
                        } else {
                            string2 = null;
                        }
                        pairArr2[1] = new Pair("creative_id", string2);
                        AwemeRawAd monetizationData6 = AwemeExtKt.getMonetizationData(aweme);
                        if (monetizationData6 != null) {
                            logExtra = monetizationData6.getLogExtra();
                        } else {
                            logExtra = null;
                        }
                        pairArr2[2] = new Pair("log_extra", logExtra);
                        pairArr2[3] = new Pair("user_agent", C1489110oqz.LIZ("other"));
                        pairArr2[4] = new Pair("access", C786410Ut5.b3(contextLIZ2));
                        pairArr2[5] = new Pair("package", contextLIZ2.getPackageName());
                        android.util.Pair<String, Boolean> pairLIZ2 = C614430O8b.LIZ(contextLIZ2);
                        if (pairLIZ2 != null) {
                            obj = pairLIZ2.first;
                        } else {
                            obj = null;
                        }
                        pairArr2[6] = new Pair("google_aid", obj);
                        mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr2), mapLIZ2);
                    }
                    iCollect2.unCollect(aid3, mapLJIIL, new AwS623S0100000_9(awS553S0100000_9, 156), null);
                }
                if (boolLIZ != null) {
                    aweme.setCollectStatus(boolLIZ.booleanValue() ? 1 : 0);
                    interfaceC616440OFu.ZX();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C616430OFt();
        }
        C616430OFt c616430OFt = this.LLILLJJLI;
        if (c616430OFt != null) {
            c616430OFt.LLILZLL = "graphic_detail";
            c616430OFt.LLILLJJLI = interfaceC616440OFu;
            c616430OFt.LLJILJIL = view;
        }
        Aweme aweme3 = this.LL;
        if (aweme3 != null && AwemeExtKt.isCollected(aweme3)) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i ^ 1;
        C616430OFt c616430OFt2 = this.LLILLJJLI;
        if (c616430OFt2 != null) {
            Object[] objArr = new Object[4];
            objArr[0] = 2;
            Aweme aweme4 = this.LL;
            if (aweme4 != null) {
                aid = aweme4.getAid();
            } else {
                aid = null;
            }
            objArr[1] = aid;
            objArr[2] = Integer.valueOf(i3);
            Aweme aweme5 = this.LL;
            if (aweme5 != null) {
                awemeType = aweme5.getAwemeType();
            } else {
                awemeType = 0;
            }
            objArr[3] = Integer.valueOf(awemeType);
            c616430OFt2.LIZJ(objArr);
        }
        if (C123100dR.LIZ(this.LLIZ)) {
            i2 = 1;
            c830490WhzLIZ = C0W38.LIZ(new Pair("action_from_page", this.LLIZ));
        } else {
            i2 = 1;
            c830490WhzLIZ = null;
        }
        if (i3 == i2) {
            C721190SQr.LIZ.LJIJ(this.LL, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, c830490WhzLIZ);
        } else {
            C721190SQr c721190SQr2 = C721190SQr.LIZ;
            Aweme aweme6 = this.LL;
            String str4 = this.LLILZIL;
            PostModeDetailParams postModeDetailParams2 = this.LLILZLL;
            if (postModeDetailParams2 != null) {
                str = postModeDetailParams2.exploreFromGroupId;
            } else {
                str = null;
            }
            c721190SQr2.LJIILLIIL(aweme6, str4, str, c830490WhzLIZ);
        }
        Aweme aweme7 = this.LL;
        if (aweme7 != null) {
            setState(new AwS24S0010000_9(AwemeExtKt.isCollected(aweme7), 14));
        }
    }
}
