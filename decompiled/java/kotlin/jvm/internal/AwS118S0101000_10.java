package kotlin.jvm.internal;

import X.C09AY;
import X.C0AXI;
import X.C0OAL;
import X.C0OBG;
import X.C0PC5;
import X.C0Q2K;
import X.C0R2W;
import X.C13LP;
import X.C1558520qew;
import X.C1603960rqE;
import X.C1697810uHb;
import X.C1840507It;
import X.C1848510yCf;
import X.C2097608Jq;
import X.C301270BrR;
import X.C329440Cvm;
import X.C418440Gaw;
import X.C642060PGi;
import X.C657820PrA;
import X.C661360Pws;
import X.C665320Q7u;
import X.C665410Q8d;
import X.C814420VxA;
import X.InterfaceC657870PrF;
import X.InterfaceC665370Q7z;
import X.InterfaceC689490R2t;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.SearchLemon8CardContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videoenhanced.TakoEnhancedVideoAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS118S0101000_10 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) awS118S0101000_10.l0;
        C665410Q8d.LIZIZ(new AwS130S0201000_3(awS118S0101000_10.i1, lifecycleOwner, (C665320Q7u) obj, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        C642060PGi c642060PGi = (C642060PGi) obj;
        if (!C301270BrR.LIZ() || awS118S0101000_10.i1 >= 0) {
            C661360Pws c661360Pws = ((SearchTop1BackgroundAssem) awS118S0101000_10.l0).LLJJIJIIJIL;
            if (c661360Pws != null) {
                c661360Pws.LIZIZ(c642060PGi.LL, awS118S0101000_10.i1);
            }
            C0PC5 c0pc5Lo = ((SearchTop1BackgroundAssem) awS118S0101000_10.l0).Lo();
            if (c0pc5Lo != null) {
                int i = c0pc5Lo.LLILZIL;
                SearchTop1BackgroundAssem searchTop1BackgroundAssem = (SearchTop1BackgroundAssem) awS118S0101000_10.l0;
                int i2 = awS118S0101000_10.i1;
                C661360Pws c661360Pws2 = searchTop1BackgroundAssem.LLJJJ;
                if (c661360Pws2 != null) {
                    c661360Pws2.LIZIZ(c642060PGi.LL, i2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
                }
                C661360Pws c661360Pws3 = searchTop1BackgroundAssem.LLJJJJ;
                if (c661360Pws3 != null) {
                    c661360Pws3.LIZIZ(c642060PGi.LL, i2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        ((C1848510yCf) obj).LJFF(new AwS118S0101000_10(awS118S0101000_10.i1, (SearchJediMixFeedFragment) awS118S0101000_10.l0, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = awS118S0101000_10.i1;
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) awS118S0101000_10.l0;
        linkedHashMap.put("e2e_cost", String.valueOf(i));
        linkedHashMap.put("is_first_refresh", C0OAL.LIZIZ(Boolean.valueOf(searchJediMixFeedFragment.LLLLIIL)));
        ((C0Q2K) obj).LIZ(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        ((C1848510yCf) obj).LJFF(new AwS118S0101000_10(awS118S0101000_10.i1, (SearchJediMixFeedFragment) awS118S0101000_10.l0, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = awS118S0101000_10.i1;
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) awS118S0101000_10.l0;
        linkedHashMap.put("e2e_cost", String.valueOf(i));
        linkedHashMap.put("is_first_refresh", C0OAL.LIZIZ(Boolean.valueOf(searchJediMixFeedFragment.LLLLIIL)));
        ((C0Q2K) obj).LIZ(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        ((Assembler) obj).MQ2((ReusedUISlotAssem) awS118S0101000_10.l0, new AwS25S0001000_10(awS118S0101000_10.i1, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        C657820PrA c657820PrA = (C657820PrA) obj;
        final AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10((SearchLemon8CardContentAssem) awS118S0101000_10.l0, 513);
        c657820PrA.LIZJ = new InterfaceC657870PrF(awS589S0100000_10) { // from class: X.0Pqq
            public final Function1<C657640Pqs, Unit> LIZ;

            @Override // X.InterfaceC657870PrF
            public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
                SearchComponentCenter.LIZ.getClass();
                return C657530Pqh.LIZ().LIZJ();
            }

            @Override // X.InterfaceC657780Pr6
            public final InterfaceC111300bX getConfig() {
                C657640Pqs c657640Pqs = new C657640Pqs(null);
                this.LIZ.invoke(c657640Pqs);
                return c657640Pqs;
            }

            {
                this.LIZ = awS589S0100000_10;
            }
        };
        c657820PrA.LIZLLL = awS118S0101000_10.i1;
        c657820PrA.LIZIZ = C1840507It.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS118S0101000_10 awS118S0101000_10, Object obj) {
        boolean z;
        String str;
        Aweme aweme;
        String str2;
        List<TakoVideoItem> videoList;
        TakoVideoItem takoVideoItem;
        List<TakoVideoItem> videoList2;
        TakoVideoItem takoVideoItem2;
        List<TakoVideoItem> videoList3;
        List<TakoVideoItem> videoList4;
        TakoVideoItem takoVideoItem3;
        String str3;
        long j;
        long j2;
        String str4;
        String str5;
        String str6;
        String str7;
        List<TakoVideoItem> videoList5;
        TakoVideoItem takoVideoItem4;
        Message msg;
        List<TakoVideoItem> videoList6;
        TakoVideoItem takoVideoItem5;
        Message msg2;
        Message msg3;
        Message msg4;
        Message msg5;
        View view = (View) obj;
        TakoEnhancedVideoAssem takoEnhancedVideoAssem = (TakoEnhancedVideoAssem) awS118S0101000_10.l0;
        int i = awS118S0101000_10.i1;
        takoEnhancedVideoAssem.getClass();
        if (((Number) C0AXI.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!C0OBG.LIZ(1500L, view)) {
                InterfaceC689490R2t interfaceC689490R2t = takoEnhancedVideoAssem.LLJLLL;
                if (interfaceC689490R2t == null || (msg5 = interfaceC689490R2t.getMsg()) == null || (str3 = msg5.msgId) == null) {
                    str3 = "";
                }
                InterfaceC689490R2t interfaceC689490R2t2 = takoEnhancedVideoAssem.LLJLLL;
                if (interfaceC689490R2t2 != null && (msg4 = interfaceC689490R2t2.getMsg()) != null) {
                    j = msg4.serverSeq;
                } else {
                    j = 0;
                }
                InterfaceC689490R2t interfaceC689490R2t3 = takoEnhancedVideoAssem.LLJLLL;
                if (interfaceC689490R2t3 != null && (msg3 = interfaceC689490R2t3.getMsg()) != null) {
                    j2 = msg3.botId;
                } else {
                    j2 = 0;
                }
                InterfaceC689490R2t interfaceC689490R2t4 = takoEnhancedVideoAssem.LLJLLL;
                if (interfaceC689490R2t4 != null && (msg2 = interfaceC689490R2t4.getMsg()) != null) {
                    str4 = msg2.versionId;
                } else {
                    str4 = null;
                }
                C1603960rqE.LIZ = new C329440Cvm(j, j2, str3, str4, takoEnhancedVideoAssem.LLLF);
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(takoEnhancedVideoAssem.getContext(), "//aweme/detail");
                smartRouteBuildRoute.withParam("video_from", "from_card_enhanced_video");
                InterfaceC689490R2t interfaceC689490R2t5 = takoEnhancedVideoAssem.LLJLLL;
                if (interfaceC689490R2t5 != null && (videoList6 = interfaceC689490R2t5.getVideoList()) != null && (takoVideoItem5 = (TakoVideoItem) C13LP.LJJJLZIJ(i, videoList6)) != null) {
                    str5 = takoVideoItem5.awemeId;
                } else {
                    str5 = null;
                }
                smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str5);
                smartRouteBuildRoute.withParam("enter_from", (String) ((LinkedHashMap) takoEnhancedVideoAssem.LLL).get("enter_from"));
                smartRouteBuildRoute.withParam("enter_method", (String) ((LinkedHashMap) takoEnhancedVideoAssem.LLL).get("enter_method"));
                InterfaceC689490R2t interfaceC689490R2t6 = takoEnhancedVideoAssem.LLJLLL;
                if (interfaceC689490R2t6 != null && (msg = interfaceC689490R2t6.getMsg()) != null) {
                    str6 = msg.uuid;
                } else {
                    str6 = null;
                }
                smartRouteBuildRoute.withParam("message_id", str6);
                smartRouteBuildRoute.withParam("process_id", (String) ((LinkedHashMap) takoEnhancedVideoAssem.LLL).get("process_id"));
                smartRouteBuildRoute.withParam("tako_session_id", (String) ((LinkedHashMap) takoEnhancedVideoAssem.LLL).get("tako_session_id"));
                smartRouteBuildRoute.withParam("tako_chat_id", (String) ((LinkedHashMap) takoEnhancedVideoAssem.LLL).get("tako_chat_id"));
                smartRouteBuildRoute.withParam("card_rank", String.valueOf(i));
                smartRouteBuildRoute.withParam("situation", "video_recommend");
                smartRouteBuildRoute.withParam("page", "base");
                InterfaceC689490R2t interfaceC689490R2t7 = takoEnhancedVideoAssem.LLJLLL;
                if (interfaceC689490R2t7 != null && (videoList5 = interfaceC689490R2t7.getVideoList()) != null && (takoVideoItem4 = (TakoVideoItem) C13LP.LJJJLZIJ(i, videoList5)) != null) {
                    str7 = takoVideoItem4.awemeId;
                } else {
                    str7 = null;
                }
                smartRouteBuildRoute.withParam("innerfeed_entrance_group_id", str7);
                smartRouteBuildRoute.withParam("innerfeed_entrance_rank", String.valueOf(i));
                smartRouteBuildRoute.open();
            }
        } else {
            C0R2W c0r2w = C0R2W.LIZ;
            InterfaceC689490R2t interfaceC689490R2t8 = takoEnhancedVideoAssem.LLJLLL;
            if (interfaceC689490R2t8 != null && (videoList4 = interfaceC689490R2t8.getVideoList()) != null && (takoVideoItem3 = (TakoVideoItem) C13LP.LJJJLZIJ(i, videoList4)) != null) {
                str = takoVideoItem3.awemeId;
            } else {
                str = null;
            }
            ArrayList arrayList = new ArrayList();
            InterfaceC689490R2t interfaceC689490R2t9 = takoEnhancedVideoAssem.LLJLLL;
            if (interfaceC689490R2t9 != null && (videoList3 = interfaceC689490R2t9.getVideoList()) != null) {
                int i2 = 0;
                for (TakoVideoItem takoVideoItem6 : videoList3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        arrayList.add(new Pair(takoVideoItem6.awemeId, Long.valueOf(i2)));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            List<TakoVideoItem> videoList7 = null;
            InterfaceC689490R2t interfaceC689490R2t10 = takoEnhancedVideoAssem.LLJLLL;
            if (interfaceC689490R2t10 != null && (videoList2 = interfaceC689490R2t10.getVideoList()) != null && (takoVideoItem2 = (TakoVideoItem) C13LP.LJJJLZIJ(i, videoList2)) != null) {
                aweme = takoVideoItem2.LIZ;
            } else {
                aweme = null;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(takoEnhancedVideoAssem);
            InterfaceC689490R2t interfaceC689490R2t11 = takoEnhancedVideoAssem.LLJLLL;
            if (interfaceC689490R2t11 != null) {
                videoList7 = interfaceC689490R2t11.getVideoList();
            }
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("situation", "video_recommend");
            pairArr[1] = new Pair("card_rank", String.valueOf(i));
            pairArr[2] = new Pair("page", "base");
            InterfaceC689490R2t interfaceC689490R2t12 = takoEnhancedVideoAssem.LLJLLL;
            if (interfaceC689490R2t12 != null && (videoList = interfaceC689490R2t12.getVideoList()) != null && (takoVideoItem = (TakoVideoItem) C13LP.LJJJLZIJ(i, videoList)) != null) {
                str2 = takoVideoItem.awemeId;
            } else {
                str2 = null;
            }
            pairArr[3] = new Pair("innerfeed_entrance_group_id", String.valueOf(str2));
            pairArr[4] = new Pair("innerfeed_entrance_rank", String.valueOf(i));
            C0R2W.LIZ(c0r2w, view, str, arrayList, aweme, interfaceC665370Q7zLJIIL, videoList7, C2097608Jq.LJIIJ(pairArr), null, 896);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0101000_10(int i, LifecycleOwner lifecycleOwner, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = lifecycleOwner;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0101000_10(int i, SearchTop1BackgroundAssem searchTop1BackgroundAssem, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = searchTop1BackgroundAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0101000_10(int i, SearchLemon8CardContentAssem searchLemon8CardContentAssem, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = searchLemon8CardContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0101000_10(int i, SearchJediMixFeedFragment searchJediMixFeedFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = searchJediMixFeedFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S0101000_10(ReusedUISlotAssem reusedUISlotAssem, ReusedUISlotAssem<?> reusedUISlotAssem2, int i) {
        super(1);
        this.$t = i;
        this.l0 = reusedUISlotAssem;
        this.i1 = reusedUISlotAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S0101000_10(TakoEnhancedVideoAssem takoEnhancedVideoAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = takoEnhancedVideoAssem;
        this.i1 = i;
    }
}
