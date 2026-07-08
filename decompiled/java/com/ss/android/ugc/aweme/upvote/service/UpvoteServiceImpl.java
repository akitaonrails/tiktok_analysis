package com.ss.android.ugc.aweme.upvote.service;

import X.AbstractC1549150qPp;
import X.AbstractC19486711Lt;
import X.AbstractC848400XPy;
import X.C03H5;
import X.C09JN;
import X.C0DPR;
import X.C0HCN;
import X.C0HD9;
import X.C0I27;
import X.C0I28;
import X.C0RSD;
import X.C0XQ7;
import X.C0ZP4;
import X.C10EU;
import X.C11NZ;
import X.C11S5;
import X.C1210540hbg;
import X.C1211130hcd;
import X.C1220000hqw;
import X.C123100dR;
import X.C1356720lPS;
import X.C1356730lPT;
import X.C1357900lRM;
import X.C1358170lRn;
import X.C1358290lRz;
import X.C1358380lS8;
import X.C1358450lSF;
import X.C1358550lSP;
import X.C1358700lSe;
import X.C1358720lSg;
import X.C1358770lSl;
import X.C1358880lSw;
import X.C1358940lT2;
import X.C1358950lT3;
import X.C1359050lTD;
import X.C1359110lTJ;
import X.C1359270lTZ;
import X.C1359320lTe;
import X.C1359330lTf;
import X.C1359350lTh;
import X.C1359430lTp;
import X.C1359500lTw;
import X.C1359540lU0;
import X.C1359600lU6;
import X.C1359670lUD;
import X.C1359680lUE;
import X.C1359730lUJ;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1788506zT;
import X.C1907210zjL;
import X.C19719912Dl;
import X.C19EG;
import X.C20669087v;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C2487409ou;
import X.C263730AVf;
import X.C298730BnL;
import X.C298760BnO;
import X.C338520DOw;
import X.C338530DOx;
import X.C429430Gsf;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C703302op;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C896990ZGv;
import X.EnumC1359020lTA;
import X.EnumC1359800lUQ;
import X.InterfaceC1359090lTH;
import X.InterfaceC1359280lTa;
import X.InterfaceC1360060lUq;
import X.InterfaceC1360230lV7;
import X.InterfaceC1361560lXG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC733830SqT;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import Y.AfS190S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionLikeRegistry;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionRepliedRegistry;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyKeyboard;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostInteractPanel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostProfileListFragment;
import com.ss.android.ugc.aweme.upvote.detail.videorepost.VideoRepostTrigger;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteAssemStateVM;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.experiment.RepostPublicInteractExp;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS104S1200000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS60S2100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteServiceImpl implements IUpvoteService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(UpvoteServiceImpl.class, "stateVM", "<v#3>", 0);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int LJJIJLIJ(int i, int i2) {
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJJIL() {
        return C13LE.LIZ(VideoRepostTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final ProfileListFragment LJFF() {
        return new RepostProfileListFragment();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIJ() {
        C1210540hbg.LIZ.getClass();
        C1210540hbg.LIZ().storeBoolean(C1210540hbg.LIZIZ("highlight_shown_"), true);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILJJIL() {
        C1359320lTe.LIZ.getClass();
        C20669087v.LIZ.getClass();
        List listLIZIZ = C20669087v.LIZIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZIZ) {
            String str = (String) obj;
            C20669087v.LIZ.getClass();
            Double d = (Double) C20669087v.LIZJ().get(str);
            if (d != null) {
                C1358880lSw.LIZ.getClass();
                if (C1358880lSw.LJFF(str) == null && d.doubleValue() < 3.0d) {
                    arrayList.add(obj);
                }
            } else {
                C1358880lSw.LIZ.getClass();
                if (C1358880lSw.LJFF(str) == null) {
                    arrayList.add(obj);
                }
            }
        }
        C2487409ou.LIZJ(new ARunnableS121S0100000_21(arrayList, 1));
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int LJJIFFI() {
        C1358720lSg.LIZ.getClass();
        return C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("expose_repost_button_exp"), 0);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIJL() {
        C1210540hbg.LIZ.getClass();
        String strLIZIZ = C1210540hbg.LIZIZ("total_shown_count_");
        String strLIZIZ2 = C1210540hbg.LIZIZ("last_shown_time_");
        C1210540hbg.LIZ().storeInt(strLIZIZ, C1210540hbg.LIZ().getInt(C1210540hbg.LIZIZ("total_shown_count_"), 0) + 1);
        C1210540hbg.LIZ().storeLong(strLIZIZ2, System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void clearCache() {
        C1358880lSw.LIZ.getClass();
        ((ConcurrentHashMap) C1358880lSw.LIZIZ.getValue()).clear();
        C1358880lSw.LJI().evictAll();
        C1358880lSw.LIZJ().clear();
        ((LinkedHashMap) C1358880lSw.LJFF).clear();
        C1358880lSw.LJIIIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return Collections.singletonList(C0DPR.class);
    }

    public UpvoteServiceImpl() {
        C1359500lTw c1359500lTw = C1359500lTw.LIZ;
        C1358450lSF c1358450lSF = new C1358450lSF(C1358380lS8.LIZ);
        c1359500lTw.getClass();
        C1359500lTw.LIZIZ = c1358450lSF;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LIZ() {
        if (!C298760BnO.LIZ()) {
            return C263730AVf.LIZ() && C1359600lU6.LIZ();
        }
        if (!C263730AVf.LIZ()) {
            return false;
        }
        if (!C1359680lUE.LIZIZ()) {
            C1359670lUD.LIZ.getClass();
            if (!C1359670lUD.LIZIZ()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIILLIIL() {
        return C1788506zT.LIZ(6.8f);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJIZ() {
        return C1359110lTJ.LIZ() && ((Number) C1359050lTD.LIZ.getValue()).intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJJJIZL() {
        if (!C298730BnL.LIZIZ()) {
            return false;
        }
        C1210540hbg.LIZ.getClass();
        if (!C1210540hbg.LIZ().getBoolean(C1210540hbg.LIZIZ("has_reposted_comment_"), false) && C1210540hbg.LIZ().getInt(C1210540hbg.LIZIZ("total_shown_count_"), 0) < 3) {
            long j = C1210540hbg.LIZ().getLong(C1210540hbg.LIZIZ("last_shown_time_"), 0L);
            if (j == 0 || System.currentTimeMillis() - j >= 86400000) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJJJJL() {
        if (!C298730BnL.LIZIZ()) {
            return false;
        }
        C1210540hbg.LIZ.getClass();
        return !C1210540hbg.LIZ().getBoolean(C1210540hbg.LIZIZ("highlight_shown_"), false);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1359280lTa LJIIL() {
        return new InterfaceC1359280lTa() { // from class: X.0lTY
            @Override // X.InterfaceC1359280lTa
            public final void LIZ(String str) {
                C19EG c19eg;
                UpvoteList upvoteListLJIIIIZZ;
                UpvoteStruct upvoteStructLIZJ;
                boolean z;
                if (str == null) {
                    return;
                }
                Activity topActivity = ActivityStack.getTopActivity();
                if ((topActivity instanceof C19EG) && (c19eg = (C19EG) topActivity) != null && (upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(str)) != null && (upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteListLJIIIIZZ)) != null) {
                    C1358950lT3.LIZ.LJFF(str);
                    AssemViewModel value = new C736950SvV(C13LE.LIZ(UpvotePublishVM.class), null, new C452070Ho5(), C724750Sbp.LJII(c19eg), C1220000hqw.LIZ(c19eg), AFwS259S0000000_21.get$arr$(32), new C0I27(c19eg), new C0I28(c19eg), new C338530DOx(c19eg)).getValue();
                    if (CarrierType.COMMENT != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    value.setStateImmediate(new C1359250lTX(str, null, z, upvoteStructLIZJ, null));
                }
            }

            @Override // X.InterfaceC1359280lTa
            public final void LIZIZ(String str, UpvoteList upvoteList, boolean z, int i) {
                String str2 = str;
                C1358950lT3 c1358950lT3 = C1358950lT3.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                C1358950lT3.LJII(c1358950lT3, str2, upvoteList, null, z, i, false, 32);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1361560lXG LJJII() {
        return new InterfaceC1361560lXG() { // from class: X.0lUB
            @Override // X.InterfaceC1361560lXG
            public final int LIZIZ() {
                return R.raw.icon_color_repost_square;
            }

            @Override // X.InterfaceC1361560lXG
            public final int LJFF() {
                return R.raw.icon_color_repost_tick_square;
            }

            @Override // X.InterfaceC1361560lXG
            public final int LJIIIIZZ() {
                return 2;
            }

            @Override // X.InterfaceC1361560lXG
            public final int LJIIIZ() {
                return R.raw.icon_pen_fill;
            }

            @Override // X.InterfaceC1361560lXG
            public final String LJIIJJI() {
                return "social_repost_withbg_tux_lottie.json";
            }

            @Override // X.InterfaceC1361560lXG
            public final void LIZJ() {
                C1359660lUC.LIZ.getClass();
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                C01GW c01gw = C1359660lUC.LIZIZ;
                Keva keva = (Keva) c01gw.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("has_upvote_bounce_shown_");
                sbLIZ.append(curUserId);
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                Keva keva2 = (Keva) c01gw.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("upvote_bounce_show_time_");
                sbLIZ2.append(curUserId);
                keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), Calendar.getInstance().getTimeInMillis());
            }

            @Override // X.InterfaceC1361560lXG
            public final int LJII() {
                return C1360460lVU.LIZIZ.LJJIJLIJ(2131845805, 2131846358);
            }

            @Override // X.InterfaceC1361560lXG
            public final int LJIIJ() {
                return C1360460lVU.LIZIZ.LJJIJLIJ(2131845806, 2131846359);
            }

            @Override // X.InterfaceC1361560lXG
            public final boolean LJIILL() {
                C1359660lUC.LIZ.getClass();
                Keva keva = (Keva) C1359660lUC.LIZIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("has_upvote_bounce_shown_");
                sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            }

            @Override // X.InterfaceC1361560lXG
            public final void LIZLLL(String str) {
                C1210490hbb.LIZ.getClass();
                C1210490hbb.LIZJ = new Pair<>(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // X.InterfaceC1361560lXG
            public final int LJIILIIL(String str) {
                List list;
                Object uid;
                UpvoteList upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(str);
                if (upvoteListLJIIIIZZ == null || (list = upvoteListLJIIIIZZ.upvotes) == null) {
                    list = C13BV.INSTANCE;
                }
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                Iterator it2 = list.iterator();
                while (true) {
                    uid = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    User user = ((UpvoteStruct) next).user;
                    if (user != null) {
                        uid = user.getUid();
                    }
                    if (Intrinsics.LJFF(uid, curUserId)) {
                        uid = next;
                        break;
                    }
                }
                UpvoteStruct upvoteStruct = (UpvoteStruct) uid;
                if (upvoteStruct == null) {
                    return 0;
                }
                UpvoteCacheState upvoteCacheState = upvoteStruct.cacheState;
                if (upvoteCacheState == UpvoteCacheState.PRE_PUBLISH) {
                    return 1;
                }
                if (upvoteCacheState == UpvoteCacheState.PRE_REMOVE) {
                    return 3;
                }
                return 2;
            }

            @Override // X.InterfaceC1361560lXG
            public final void LJIILJJIL(String str) {
                C1210490hbb.LIZ.getClass();
                C1210490hbb.LIZIZ = new Pair<>(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // X.InterfaceC1361560lXG
            public final void LJ(String str, String str2) {
                C1210490hbb.LIZ.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Intrinsics.LJFF(C1210490hbb.LIZJ.getFirst(), str)) {
                    C1210490hbb.LIZ(jElapsedRealtime - C1210490hbb.LIZJ.getSecond().longValue(), str, str2, "share_panel");
                    C1210490hbb.LIZJ = new Pair<>("", -1L);
                }
            }

            @Override // X.InterfaceC1361560lXG
            public final void LJI(String str, String str2) {
                C1210490hbb.LIZ.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Intrinsics.LJFF(C1210490hbb.LIZIZ.getFirst(), str)) {
                    C1210490hbb.LIZ(jElapsedRealtime - C1210490hbb.LIZIZ.getSecond().longValue(), str, str2, "long_press");
                    C1210490hbb.LIZIZ = new Pair<>("", -1L);
                }
            }

            @Override // X.InterfaceC1361560lXG
            public final boolean LIZ(Aweme aweme, Boolean bool, boolean z) {
                String aid;
                if (Intrinsics.LJFF(bool, Boolean.TRUE) && C1360460lVU.LIZIZ.LJIJJLI(aweme) && !z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    sbLIZ.append(", canUpvoteAweme, avoidBy hit_expose_repost_button_exp");
                    C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                return C1358940lT2.LIZIZ(aweme);
            }

            @Override // X.InterfaceC1361560lXG
            public final void LJIIL(UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, String str, AwS600S0100000_21 awS600S0100000_21) {
                List<UpvoteStruct> list;
                String uid;
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                UpvoteList upvoteListLJIIIIZZ = C1360460lVU.LIZIZ.LJIIIIZZ(str);
                UpvoteStruct upvoteStruct = null;
                if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
                    Iterator<UpvoteStruct> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        UpvoteStruct next = it2.next();
                        User user = next.user;
                        if (user != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        if (Intrinsics.LJFF(uid, curUserId)) {
                            upvoteStruct = next;
                            break;
                        }
                    }
                }
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LIZJ();
                if (upvoteStruct != null) {
                    upvotePublishMobParam.enterMethod = "button";
                    C1360460lVU.LIZIZ.LJ(str, upvotePublishMobParam, false, new AwS565S0100000_21(awS600S0100000_21, 69), null, null, null, null, false);
                } else {
                    upvotePublishMobParam.enterMethod = "share_panel";
                    C1360460lVU.LIZIZ.LJJJ(null, null, null, upvotePublishExtraData, upvotePublishMobParam, 0, str, null, null, null, null, new AwS565S0100000_21(awS600S0100000_21, 70), new AwS104S1200000_21(upvotePublishExtraData, upvotePublishMobParam, str, 1), true);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC733830SqT LJJIJIIJIL() {
        return new InterfaceC733830SqT() { // from class: X.0lTu
            @Override // X.InterfaceC733830SqT
            public final void LIZ() {
                C1358720lSg.LIZ.getClass();
                C1358720lSg.LIZIZ().storeBoolean(C1358720lSg.LIZ("upvote_toast_when_digg_video_"), true);
            }

            @Override // X.InterfaceC733830SqT
            public final boolean LIZIZ() {
                C1358720lSg.LIZ.getClass();
                return C1358720lSg.LIZIZ().getBoolean(C1358720lSg.LIZ("upvote_toast_when_digg_video_"), false);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1360230lV7 LJJJJI() {
        return new InterfaceC1360230lV7() { // from class: X.0lTg
            @Override // X.InterfaceC1360230lV7
            public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZJ() {
                if (!C298760BnO.LIZ()) {
                    if (C1359680lUE.LIZIZ()) {
                        return C13LE.LIZ(UpvoteVideoAssemNew.class);
                    }
                    return null;
                }
                if (!C1359680lUE.LIZIZ()) {
                    C1359670lUD.LIZ.getClass();
                    if (!C1359670lUD.LIZIZ()) {
                        return null;
                    }
                }
                return C13LE.LIZ(UpvoteVideoAssemNew.class);
            }

            @Override // X.InterfaceC1360230lV7
            public final void LIZ(ReusedUIAssem reusedUIAssem, C13IQ c13iq) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C06YM(c13iq, reusedUIAssem, null), 3);
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x012d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0157  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x016f  */
            @Override // X.InterfaceC1360230lV7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r9, com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r10) {
                /*
                    Method dump skipped, instruction units count: 466
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1359340lTg.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams):boolean");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LIZJ(int i) {
        boolean z;
        if (i != 1 && i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (C298760BnO.LIZ()) {
            if (z) {
                return false;
            }
            if (!C1359680lUE.LIZIZ()) {
                C1359670lUD.LIZ.getClass();
                if (!C1359670lUD.LIZIZ()) {
                    return false;
                }
            }
            return true;
        }
        if (z || !C1359680lUE.LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C1357900lRM> LIZLLL(C19EG c19eg) {
        return new C736950SvV(C13LE.LIZ(RepostSyncViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(c19eg), C1220000hqw.LIZ(c19eg), AFwS259S0000000_21.get$arr$(282), new C0I27(c19eg), new C0I28(c19eg), new C338530DOx(c19eg)).getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteList LJIIIIZZ(String str) {
        C1358880lSw.LIZ.getClass();
        return C1358880lSw.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C896990ZGv> LJIIIZ(C19EG c19eg) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UpvoteAssemStateVM.class);
        AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 1952), new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) c19eg, 1953), AFwS259S0000000_21.get$arr$(283));
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZ;
        return assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIILIIL(String str) {
        List<UpvoteStruct> commentUpvotes;
        String uid;
        if (!C298730BnL.LIZIZ()) {
            return false;
        }
        C1358880lSw.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        UpvoteList upvoteList = (UpvoteList) C1358880lSw.LJI().get(str);
        if (upvoteList == null || (commentUpvotes = upvoteList.getCommentUpvotes()) == null || commentUpvotes.isEmpty()) {
            return false;
        }
        Iterator<UpvoteStruct> it2 = commentUpvotes.iterator();
        int i = 0;
        while (it2.hasNext()) {
            User user = it2.next().user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, curUserId) && (i = i + 1) < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        if (i < 15) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C1358700lSe> LJIJI(Fragment fragment) {
        return new C736950SvV(C13LE.LIZ(UpvotePublishVM.class), null, new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment), AFwS259S0000000_21.get$arr$(280), new C451460Hn6(fragment, false), new C451620HnM(fragment, true), new C338520DOw(fragment)).getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIJJLI(Aweme aweme) {
        if (aweme == null || !C0RSD.LIZ()) {
            return false;
        }
        if (C0HCN.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(", canVideoRepostShown, avoidBy small_screen_phone");
            C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        return C1358940lT2.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        return C1358940lT2.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJJIIZ(String str) {
        List<UpvoteStruct> list;
        UpvoteList upvoteListLJIIIIZZ = LJIIIIZZ(str);
        if (upvoteListLJIIIIZZ == null || (list = upvoteListLJIIIIZZ.upvotes) == null || list.isEmpty()) {
            return false;
        }
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            if (C10EU.LJIILLIIL(it2.next().user)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C1358700lSe> LJJIJ(C19EG c19eg) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UpvotePublishVM.class);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(281);
        C0I27 c0i27 = new C0I27(c19eg);
        C0I28 c0i28 = new C0I28(c19eg);
        C338530DOx c338530DOx = new C338530DOx(c19eg);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(c19eg);
        if (!(c19eg instanceof HasDefaultViewModelProviderFactory)) {
            c19eg = null;
        }
        return new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(c19eg), aFwS259S0000000_21, c0i27, c0i28, c338530DOx).getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC1360060lUq LJJIJIL(String str) {
        return new InterfaceC1360060lUq() { // from class: X.0lU5
            public String LIZ = "";
            public String LIZIZ = "";

            @Override // X.InterfaceC1360060lUq
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJJLJLI() {
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJL() {
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJIIJ() {
                this.LIZIZ = Intrinsics.LJFF(this.LIZIZ, "guide") ? "guide_info" : "info";
            }

            @Override // X.InterfaceC1360060lUq
            public final void LIZJ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", onQuickButtonClick");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", onInfoClick");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJII() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", onGuideClick");
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1360060lUq
            public final void LIZ(String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", info tag show, reason:");
                sbLIZ.append(str2);
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1360060lUq
            public final void LIZIZ(String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", onRepostVmCallback, reason:");
                sbLIZ.append(str2);
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJFF(String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", avoidBy ");
                sbLIZ.append(str2);
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJI(String str2) {
                this.LIZ = str2;
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJIIIIZZ(String str2, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(", logCanShow: ");
                sbLIZ.append(z);
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1360060lUq
            public final void LJIIJJI(String str2, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", guide tag show, trigger:");
                sbLIZ.append(str2);
                sbLIZ.append(", isAi:");
                sbLIZ.append(z);
                C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
                if (Intrinsics.LJFF(this.LIZIZ, "none")) {
                    this.LIZIZ = "guide";
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJJ(String str) {
        C1358550lSP.LIZ.getClass();
        C20684815ws.LJIJI("ttsocial_repost_tooltip_show", new Pair("comment_panel", "enter_from"), new Pair(str, "enter_method"), new Pair("repost_comment_tooltip", Scene.SCENE_SERVICE));
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Long LJJJJL(String str) {
        C1358880lSw.LIZ.getClass();
        return (Long) ((LinkedHashMap) C1358880lSw.LIZJ).get(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJLL(int i) {
        C1358720lSg.LIZ.getClass();
        C1358720lSg.LIZIZ().storeInt(C1358720lSg.LIZ("expose_repost_button_exp"), i);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final String LIZIZ(String str, String str2) {
        return C1211130hcd.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJII(String str, String str2) {
        C1358880lSw.LIZ.getClass();
        C1358880lSw.LIZLLL.put(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIJ(String str, String str2) {
        C1358880lSw.LIZ.getClass();
        C1358880lSw.LJFF.put(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C0HD9 LJIL(String str, String str2) {
        List<UpvoteStruct> commentUpvotes;
        Object next;
        Object next2;
        boolean z;
        String strLJII;
        String nickname;
        String str3;
        boolean z2;
        boolean z3;
        User user;
        String cid;
        Comment comment;
        UpvoteCacheState upvoteCacheState = null;
        if (!C298730BnL.LIZIZ()) {
            return null;
        }
        UpvoteList upvoteListLJIIIIZZ = LJIIIIZZ(str);
        if (upvoteListLJIIIIZZ != null && (commentUpvotes = upvoteListLJIIIIZZ.getCommentUpvotes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (UpvoteStruct upvoteStruct : commentUpvotes) {
                UpvoteStruct upvoteStruct2 = upvoteStruct;
                if (str2.length() != 0) {
                    if (!Intrinsics.LJFF(upvoteStruct2.carrierId, str2)) {
                        CommentInfoStruct commentInfoStruct = upvoteStruct2.commentInfo;
                        if (commentInfoStruct != null && (comment = commentInfoStruct.comment) != null) {
                            cid = comment.getCid();
                        } else {
                            cid = null;
                        }
                        if (Intrinsics.LJFF(cid, str2)) {
                        }
                    }
                    arrayList.add(upvoteStruct);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (C10EU.LJIILLIIL(((UpvoteStruct) next).user)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                UpvoteStruct upvoteStruct3 = (UpvoteStruct) next;
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (!C10EU.LJIILLIIL(((UpvoteStruct) next2).user)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                UpvoteStruct upvoteStruct4 = (UpvoteStruct) next2;
                if (upvoteStruct3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                int size = arrayList.size();
                if (upvoteStruct3 != null) {
                    C1358770lSl.LIZ.getClass();
                    strLJII = C1358770lSl.LJII(upvoteStruct3);
                } else {
                    strLJII = null;
                }
                if (upvoteStruct4 != null && (user = upvoteStruct4.user) != null) {
                    nickname = user.getNickname();
                } else {
                    nickname = null;
                }
                if (upvoteStruct3 != null) {
                    str3 = upvoteStruct3.text;
                } else {
                    str3 = null;
                }
                if (C123100dR.LIZ(str3)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (upvoteStruct3 != null) {
                    upvoteCacheState = upvoteStruct3.cacheState;
                }
                if (upvoteCacheState == UpvoteCacheState.PRE_PUBLISH) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new C0HD9(z, size, strLJII, nickname, z2, false, z3, 32);
            }
        }
        C1358880lSw.LIZ.getClass();
        String str4 = C1358880lSw.LJIIIZ.get(str2);
        if (str4 == null) {
            return null;
        }
        return new C0HD9(false, 1, null, str4, false, true, false, 84);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJI(String str, String str2) {
        C1358880lSw.LIZ.getClass();
        C1358880lSw.LJIIIZ.put(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C0ZP4 LJJJJLI(C19EG c19eg, AFwS252S0000000_16 aFwS252S0000000_16) {
        return AssemViewModel.selectSubscribe$default(new C736950SvV(C13LE.LIZ(UpvotePublishVM.class), null, new C452070Ho5(), C724750Sbp.LJII(c19eg), C1220000hqw.LIZ(c19eg), AFwS259S0000000_21.get$arr$(34), new C0I27(c19eg), new C0I28(c19eg), new C338530DOx(c19eg)).getValue(), new C2217381BqS() { // from class: X.0cG0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1358700lSe) obj).LLILLL;
            }
        }, null, null, null, new AwS600S0100000_21(aFwS252S0000000_16, 12), 10, null);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJ(C19EG c19eg, Object obj, C1356730lPT c1356730lPT) {
        VideoItemParams videoItemParams;
        if ((obj instanceof VideoItemParams) && (videoItemParams = (VideoItemParams) obj) != null) {
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            RepostReplyKeyboard.LLJJIJI = System.currentTimeMillis();
            C1356720lPS.LIZIZ(c19eg);
            C1356720lPS.LIZ(videoItemParams, c1356730lPT, true).show(supportFragmentManager, "repost_reply_keyboard");
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJI(List<? extends Aweme> list, EnumC1359020lTA enumC1359020lTA, InterfaceC1359090lTH interfaceC1359090lTH) {
        LJJIIZI(interfaceC1359090lTH, enumC1359020lTA, list, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIII(final EnumC1359020lTA enumC1359020lTA, final List list, final Map map) {
        AbstractC19486711Lt.LJIIL(new Callable() { // from class: X.0lTO
            public final /* synthetic */ boolean LLILLJJLI = true;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("UpvoteServiceImpl@860a.onGetFriendsV3FeedResult$1");
                C1358950lT3.LJIIIIZZ(C1358950lT3.LIZ, list, this.LLILLJJLI, null, map, true, enumC1359020lTA, null, null, 384);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("UpvoteServiceImpl@860a.onGetFriendsV3FeedResult$1");
                return unit;
            }
        }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJZ(String str, String str2, String str3) {
        C1358880lSw.LIZ.getClass();
        ((ConcurrentHashMap) C1358880lSw.LJ.getValue()).put(str, C2097908Jt.LIZJ(new Pair(str2, a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6))));
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C11NZ LJI(String str, long j, int i, Integer num) {
        UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
        C1358950lT3.LIZ.getClass();
        return upvoteApi.getRepostVideoList(str, j, i, num, C1358950lT3.LIZIZ(), null, null);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIZILJ(C19EG c19eg, Object obj, Aweme aweme, String str) {
        VideoItemParams videoItemParams;
        if (!(obj instanceof VideoItemParams) || (videoItemParams = (VideoItemParams) obj) == null || !C1359110lTJ.LIZ()) {
            return;
        }
        C1358290lRz.LIZJ(RepostInteractPanel.LLJJJJ, aweme, null, videoItemParams, c19eg, null, "click_view_more_btn", "friends_v3_feeds", str, Long.valueOf(System.currentTimeMillis()), null, null, 1552);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIJJ(Aweme aweme, String str, String str2, boolean z) {
        String str3;
        C1359350lTh c1359350lTh = C1359350lTh.LIZ;
        if (z) {
            str3 = "1";
        } else {
            str3 = "-1";
        }
        C1359350lTh.LIZIZ(c1359350lTh, str, "normal", aweme, "comment_long_press", null, false, 0.0d, null, null, null, str2, str3, 1008);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIIJ(String str, UpvotePublishExtraData upvotePublishExtraData, UpvotePublishMobParam upvotePublishMobParam, C1359270lTZ c1359270lTZ, Function1<? super Boolean, Unit> function1) {
        C1359320lTe.LIZ.getClass();
        C1359320lTe.LIZ(str, upvotePublishExtraData, upvotePublishMobParam, c1359270lTZ, function1);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIJJI(List<? extends Aweme> list, final boolean z, final Map<String, Long> map, final Map<String, String> map2, final EnumC1359020lTA enumC1359020lTA, final InterfaceC1359090lTH interfaceC1359090lTH) {
        final List listLLIIII = C13LP.LLIIII(C13LP.LJJJJLI(list));
        AbstractC19486711Lt.LJIIL(new Callable() { // from class: X.0lTM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("UpvoteServiceImpl@860a.onGetRepostFeedResult$1");
                C1358950lT3.LJIIIIZZ(C1358950lT3.LIZ, listLLIIII, z, map, map2, true, enumC1359020lTA, interfaceC1359090lTH, null, 384);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("UpvoteServiceImpl@860a.onGetRepostFeedResult$1");
                return unit;
            }
        }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIIZI(final InterfaceC1359090lTH interfaceC1359090lTH, final EnumC1359020lTA enumC1359020lTA, List list, final Map map, final Map map2, final Map map3) {
        final List<Aweme> listLLIIII = C13LP.LLIIII(C13LP.LJJJJLI(list));
        for (Aweme aweme : listLLIIII) {
            String aid = aweme.getAid();
            if (aid != null) {
                C1358880lSw.LIZ.getClass();
                if (C123100dR.LIZ(C1358880lSw.LIZLLL(aid))) {
                    AwemeBizExtKt.setReplaceRecTagByRepost(aweme, true);
                }
            }
        }
        AbstractC19486711Lt.LJIIL(new Callable() { // from class: X.0lTN
            public final /* synthetic */ boolean LLILLJJLI = false;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("UpvoteServiceImpl@860a.onGetFeedResult$2");
                C1358950lT3.LJIIIIZZ(C1358950lT3.LIZ, listLLIIII, this.LLILLJJLI, map, map2, false, enumC1359020lTA, interfaceC1359090lTH, map3, 144);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("UpvoteServiceImpl@860a.onGetFeedResult$2");
                return unit;
            }
        }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIJIIJI(Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        C1358550lSP.LJIJJLI(C1358550lSP.LIZ, str, str2, aweme, str3, null, 0, null, str4, str5, "comment", 112);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final View LJIILL(Context context, Aweme aweme, String str, String str2, RepostReplyStruct repostReplyStruct, int i, C1907210zjL c1907210zjL) {
        boolean z;
        String str3;
        String str4;
        Integer num;
        int iIntValue;
        Integer num2;
        String str5;
        TuxTextView tuxTextView;
        LinearLayout linearLayout;
        RepostPublicInteractExp.LIZ.getClass();
        RepostPublicInteractExp.RepostPublicInteractConfig repostPublicInteractConfigLIZIZ = RepostPublicInteractExp.LIZIZ();
        boolean z2 = true;
        if (repostPublicInteractConfigLIZIZ != null && repostPublicInteractConfigLIZIZ.noticeQuickAction) {
            z = true;
        } else {
            z = false;
        }
        String str6 = null;
        if (!z || str.length() == 0) {
            return null;
        }
        if ((i == 20116 || i == 20117) && (repostReplyStruct == null || (str3 = repostReplyStruct.replyId) == null || str3.length() == 0)) {
            return null;
        }
        C1359330lTf c1359330lTf = new C1359330lTf(context);
        c1359330lTf.LLILLJJLI = aweme;
        c1359330lTf.LLILLL = str;
        c1359330lTf.LLILZ = str2;
        c1359330lTf.LLILZIL = repostReplyStruct;
        c1359330lTf.LLILZLL = c1907210zjL;
        RepostQuickActionLikeRegistry repostQuickActionLikeRegistry = RepostQuickActionLikeRegistry.LL;
        if (repostReplyStruct != null) {
            str4 = repostReplyStruct.replyId;
        } else {
            str4 = null;
        }
        C1359430lTp c1359430lTpLIZLLL = repostQuickActionLikeRegistry.LIZLLL(str4);
        if (c1359430lTpLIZLLL != null) {
            z2 = c1359430lTpLIZLLL.LIZ;
        } else if (repostReplyStruct == null || (num = repostReplyStruct.userDigged) == null || num.intValue() != 1) {
            z2 = false;
        }
        c1359330lTf.LLJJ = z2;
        if (c1359430lTpLIZLLL != null) {
            iIntValue = c1359430lTpLIZLLL.LIZIZ;
        } else if (repostReplyStruct != null && (num2 = repostReplyStruct.diggCount) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        c1359330lTf.LLJJI = iIntValue;
        RepostQuickActionRepliedRegistry repostQuickActionRepliedRegistry = RepostQuickActionRepliedRegistry.LL;
        if (repostReplyStruct != null) {
            str5 = repostReplyStruct.replyId;
        } else {
            str5 = null;
        }
        c1359330lTf.LLJJIII = repostQuickActionRepliedRegistry.LJ(str5);
        if (repostReplyStruct != null) {
            str6 = repostReplyStruct.replyId;
        }
        String strLIZLLL = repostQuickActionRepliedRegistry.LIZLLL(str6);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        c1359330lTf.LLJJIJI = strLIZLLL;
        TuxIconView tuxIconView = c1359330lTf.LLJILJILJ;
        if (tuxIconView != null && (tuxTextView = c1359330lTf.LLJILLL) != null && (linearLayout = c1359330lTf.LLJI) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            c1359330lTf.LJFF(tuxIconView);
            c1359330lTf.LIZLLL(22, linearLayout);
            if (c1359330lTf.LL) {
                c1359330lTf.LIZLLL(24, linearLayout);
                tuxTextView.setTuxFont(71);
                c1359330lTf.LJI(tuxIconView, 0, 4);
                c1359330lTf.LJ(linearLayout, 8, 0, 8, 0);
            } else {
                tuxTextView.setTuxFont(72);
                c1359330lTf.LJI(tuxIconView, 0, 2);
                c1359330lTf.LJ(linearLayout, 5, 0, 6, 0);
            }
        }
        c1359330lTf.LIZ();
        c1359330lTf.LIZJ(false);
        View view = c1359330lTf.LLIZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(c1359330lTf, 127), view);
        }
        View view2 = c1359330lTf.LLIZLLLIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(c1359330lTf, 128), view2);
        }
        return c1359330lTf;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJJJ(C19EG c19eg, final Aweme aweme, final String str, String str2, final boolean z, final int i, C1359540lU0 c1359540lU0) {
        String str3;
        String str4;
        String uid;
        int i2;
        final RepostSyncViewModel repostSyncViewModel = (RepostSyncViewModel) new C736950SvV(C13LE.LIZ(RepostSyncViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(c19eg), C1220000hqw.LIZ(c19eg), AFwS259S0000000_21.get$arr$(33), new C0I27(c19eg), new C0I28(c19eg), new C338530DOx(c19eg)).getValue();
        if (!repostSyncViewModel.LL) {
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            if (z) {
                str3 = "cancel_like";
            } else {
                str3 = "like";
            }
            String aid = aweme.getAid();
            Boolean boolValueOf = Boolean.valueOf(c1359540lU0.LIZIZ);
            int iLIZLLL = 0;
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                str4 = "repost_with_text";
            } else if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                str4 = "repost_no_text";
            } else if (C703302op.LIZ(null) && !Intrinsics.LJFF(null, CardStruct.IStatusCode.DEFAULT)) {
                str4 = "reply_to_reply";
            } else {
                str4 = "reply_to_repost";
            }
            User user = c1359540lU0.LIZ;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = c1359540lU0.LIZ;
            if (user2 != null) {
                iLIZLLL = C1358170lRn.LIZLLL(user2);
            }
            Integer numValueOf = Integer.valueOf(iLIZLLL);
            c1358550lSP.getClass();
            C1358550lSP.LIZLLL(str3, "homepage_friends", "friends_repost_cell", null, aid, str4, uid, str, numValueOf, null, "friends_v3_feeds");
            repostSyncViewModel.LL = true;
            repostSyncViewModel.vQ2(i, aweme, str, null, z);
            UpvoteApi upvoteApi = UpvoteApi.LIZIZ;
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            String aid2 = aweme.getAid();
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            repostSyncViewModel.LLILLJJLI.LIZ(upvoteApi.requestRepostLike(curUserId, str, aid2, str2, i2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS190S0100000_21(repostSyncViewModel, 21), new C09JN() { // from class: X.0lRP
                public final /* synthetic */ RepostReplyStruct LLILZ = null;

                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str5;
                    C1C7U.LIZ("RepostSyncViewModel@ea3b.diggRepost$2");
                    RepostSyncViewModel repostSyncViewModel2 = repostSyncViewModel;
                    repostSyncViewModel2.LL = false;
                    Aweme aweme2 = aweme;
                    String str6 = str;
                    RepostReplyStruct repostReplyStruct = this.LLILZ;
                    if (repostReplyStruct != null) {
                        str5 = repostReplyStruct.replyId;
                    } else {
                        str5 = null;
                    }
                    int i3 = i;
                    boolean z2 = z;
                    C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
                    String aid3 = aweme2.getAid();
                    c1358380lS8.getClass();
                    C1358380lS8.LJII(i3, aid3, str6, str5, z2);
                    aweme2.getAid();
                    repostSyncViewModel2.xQ2(i3, str6, str5, z2);
                    C1358550lSP.LIZ.getClass();
                    C1358550lSP.LJIIL(0);
                    C1C7U.LIZIZ("RepostSyncViewModel@ea3b.diggRepost$2");
                }
            }));
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJ(String str, UpvotePublishMobParam upvotePublishMobParam, boolean z, Function0 function0, Function0 function02, CarrierType carrierType, String str2, String str3, boolean z2) {
        boolean zLJI = MethodIDManager.LJI(202450);
        C1359320lTe.LIZJ(C1359320lTe.LIZ, str, upvotePublishMobParam, z, function0, function02, z2, carrierType, str2, str3, null, 1024);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJIL(C19EG c19eg, Aweme aweme, String str, String str2, String str3, String str4, AwS60S2100000_21 awS60S2100000_21, String str5, String str6) {
        String str7 = str3;
        if (!C298730BnL.LIZIZ()) {
            return;
        }
        String str8 = RepostInputFragment._pnsPageId;
        C1359730lUJ.LIZIZ(c19eg);
        if (str7 == null) {
            str7 = "";
        }
        C1359730lUJ.LIZ(aweme, true, str7, str4, null, null, EnumC1359800lUQ.INPUT_BOX, null, CarrierType.COMMENT, str, str2, str5, str6, null, 16752).show(c19eg.getSupportFragmentManager(), "REPOST_INPUT");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024e  */
    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(com.ss.android.ugc.aweme.comment.model.Comment r85, com.ss.android.ugc.aweme.feed.model.upvote.CarrierType r86, X.C453740Hqm r87, com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData r88, com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam r89, java.lang.Integer r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, final java.util.List r95, kotlin.jvm.functions.Function0 r96, final kotlin.jvm.functions.Function1 r97, boolean r98) {
        /*
            Method dump skipped, instruction units count: 1903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl.LJJJ(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.upvote.CarrierType, X.0Hqm, com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData, com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean):void");
    }
}
