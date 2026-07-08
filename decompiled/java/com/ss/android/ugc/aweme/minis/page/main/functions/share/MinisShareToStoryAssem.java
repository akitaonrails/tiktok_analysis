package com.ss.android.ugc.aweme.minis.page.main.functions.share;

import X.AbstractC1433460nPE;
import X.AbstractC738140SxQ;
import X.C0DMI;
import X.C0MM8;
import X.C0MML;
import X.C0QSJ;
import X.C1324500kZU;
import X.C1360890lWB;
import X.C1389910mGz;
import X.C1392140mKa;
import X.C1392150mKb;
import X.C13LE;
import X.C1434650nR9;
import X.C1434900nRY;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19EG;
import X.C2097608Jq;
import X.C2195221Avo;
import X.C2217381BqS;
import X.C497820Jfg;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1430380nKG;
import X.InterfaceC1146704e9;
import X.InterfaceC1324510kZV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.MinisAnchorInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisShareToStoryAssem extends AbstractC738140SxQ implements IMinisTimingProtocol, SocialPublishCallback, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public String LL = "";
    public Function1<? super C1392140mKa, Unit> LLILLJJLI;
    public boolean LLILLL;
    public volatile InterfaceC1324510kZV LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public C0QSJ LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MinisShareToStoryAssem.class, "coreAbility", "getCoreAbility()Lcom/ss/android/ugc/aweme/minis/page/main/ability/MinisCoreAbility;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Xm0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Ym1() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MinisMainScope.class});
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final InterfaceC1324510kZV m267do() {
        InterfaceC1324510kZV interfaceC1324510kZV = this.LLILZ;
        if (interfaceC1324510kZV == null) {
            synchronized (this) {
                interfaceC1324510kZV = this.LLILZ;
                if (interfaceC1324510kZV == null) {
                    InterfaceC1324510kZV interfaceC1324510kZVBo = bo();
                    this.LLILZ = interfaceC1324510kZVBo;
                    return interfaceC1324510kZVBo;
                }
            }
        }
        return interfaceC1324510kZV;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MinisMainScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReportPublish() {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthesisSuccess(PublishModel publishModel, String str) {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void sZ1() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void wB0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void zd0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJJJJZI() {
        Function1<? super Function1<? super C1392140mKa, Unit>, Unit> function1 = C1392150mKb.LLILLL;
        C1392150mKb.LLILLL = new C1324500kZU(this);
    }

    public final InterfaceC1324510kZV bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLILZLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILZIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLILZIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MinisMainScope.class});
            this.LLILZLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1324510kZV interfaceC1324510kZV = (InterfaceC1324510kZV) c0qsjLIZLLL.getAbility(InterfaceC1324510kZV.class);
        C687700QyG.LJ(interfaceC1324510kZV, InterfaceC1324510kZV.class);
        return interfaceC1324510kZV;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void pw1() {
        Function1<? super Function1<? super C1392140mKa, Unit>, Unit> function1 = C1392150mKb.LLILLL;
        C1392150mKb.LLILLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMinisTimingProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Function1<? super Function1<? super C1392140mKa, Unit>, Unit> function1 = C1392150mKb.LLILLL;
        C1392150mKb.LLILLL = null;
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.f8(this);
        }
        this.LLILLJJLI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Function1<? super C1392140mKa, Unit> function1;
        super.onResume();
        if (this.LLILLL && (function1 = this.LLILLJJLI) != null) {
            function1.invoke(new C1392140mKa(5, "user exit edit page", 4));
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null) {
                return;
            }
            C1389910mGz c1389910mGz = new C1389910mGz(c19egLIZ);
            c1389910mGz.LJIIIZ(2131822275);
            c1389910mGz.LIZ.LIZIZ = 1;
            c1389910mGz.LJI(R.style.y0);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZLLL = 3;
            c1360890lWB.LJ = null;
            c1389910mGz.LJIIJJI();
            this.LLILLJJLI = null;
        }
        this.LLILLL = false;
    }

    public final void ho(Bitmap bitmap) {
        TiktokMinisQueryParams tiktokMinisQueryParams;
        String str;
        String str2;
        Context context = getContext();
        Map mapLJIIIIZZ = null;
        if (context == null) {
            Function1<? super C1392140mKa, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(new C1392140mKa(4, "context is null", 4));
            }
            this.LLILLJJLI = null;
            return;
        }
        MinisMetaResp minisMetaRespXs = m267do().Xs();
        if (minisMetaRespXs == null) {
            Function1<? super C1392140mKa, Unit> function12 = this.LLILLJJLI;
            if (function12 != null) {
                function12.invoke(new C1392140mKa(4, "meta data is null", 4));
            }
            this.LLILLJJLI = null;
            return;
        }
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.Kg(this, new AwS600S0100000_21(this, 145));
        }
        Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(new Pair("client_key", minisMetaRespXs.clientKey), new Pair("name", minisMetaRespXs.name), new Pair("path", "/"), new Pair("link_description", minisMetaRespXs.description), new Pair("source", "post_by_mobile"));
        String strJ3 = C786410Ut5.J3(new JSONObject(mapLJIIIIZZ2));
        int type = EnumC1430380nKG.MINIS_ANCHOR.getTYPE();
        String strValueOf = String.valueOf(mapLJIIIIZZ2.get("path"));
        String str3 = (String) mapLJIIIIZZ2.get("name");
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        MinisAnchorInfo minisAnchorInfo = new MinisAnchorInfo(type, strJ3, strValueOf, str3, "MINIS", "");
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        ICreativeForwardService iCreativeForwardService = (ICreativeForwardService) PluggableExtentionKt.pluggableSpi$default(ICreativeForwardService.class, false, false, false, 14, null);
        if (iCreativeForwardService != null) {
            ForwardVideo forwardVideo = new ForwardVideo(null, null, C497820Jfg.LIZIZ(context), (C497820Jfg.LIZIZ(context) * 16) / 9, 0, null, null, null, false, null, null, null, 0, null, 16371, null);
            List listSingletonList = Collections.singletonList(minisAnchorInfo);
            if (schemaParserData != null) {
                Pair[] pairArr = new Pair[5];
                String str5 = schemaParserData.clientKey;
                if (str5 == null) {
                    str5 = "";
                }
                pairArr[0] = new Pair("minis_id", str5);
                TiktokMinisQueryParams tiktokMinisQueryParams2 = schemaParserData.tiktokMinisParams;
                if (tiktokMinisQueryParams2 == null || (str2 = tiktokMinisQueryParams2.minisCategory) == null) {
                    str2 = "";
                }
                pairArr[1] = new Pair("minis_category", str2);
                pairArr[2] = new Pair("minis_version", schemaParserData.LJI());
                String strLJIIIZ = schemaParserData.LJIIIZ();
                if (strLJIIIZ == null) {
                    strLJIIIZ = "";
                }
                pairArr[3] = new Pair("ttoclid", strLJIIIZ);
                pairArr[4] = new Pair("minis_type", schemaParserData.LJFF());
                mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            }
            C0MM8 c0mm8 = new C0MM8(bitmap, listSingletonList, mapLJIIIIZZ);
            String strLIZ = C0DMI.LIZ();
            this.LL = strLIZ;
            SchemaParserData schemaParserData2 = C2195221Avo.LJII;
            if (schemaParserData2 != null && (tiktokMinisQueryParams = schemaParserData2.tiktokMinisParams) != null && (str = tiktokMinisQueryParams.enterFrom) != null) {
                str4 = str;
            }
            ICreativeForwardService.DefaultImpls.startForward$default(iCreativeForwardService, context, new ForwardMedia(null, 0, null, str4, "minis_to_story", forwardVideo, 0.0f, null, null, null, 0L, 0, "minis_game_to_story", false, null, null, null, null, false, null, null, null, null, c0mm8, strLIZ, 8384455, null), new C0MML(null, null, false, false), null, 8, null);
        }
        this.LLILLL = true;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        Function1<? super C1392140mKa, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(new C1392140mKa(0, null, 6));
        }
        this.LLILLJJLI = null;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C1389910mGz c1389910mGz = new C1389910mGz(c19egLIZ);
        c1389910mGz.LJIIIZ(2131822276);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 3;
        c1360890lWB.LJ = null;
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIJJI();
        this.LLILLL = false;
    }

    public final void fo(Function1<? super C1392140mKa, Unit> function1, C1392140mKa c1392140mKa) {
        function1.invoke(c1392140mKa);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C1389910mGz c1389910mGz = new C1389910mGz(c19egLIZ);
        c1389910mGz.LJIIIZ(2131822275);
        c1389910mGz.LIZ.LIZIZ = 1;
        c1389910mGz.LJI(R.style.y0);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZLLL = 3;
        c1360890lWB.LJ = null;
        c1389910mGz.LJIIJJI();
    }
}
