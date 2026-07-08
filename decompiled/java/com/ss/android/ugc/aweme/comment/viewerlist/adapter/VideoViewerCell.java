package com.ss.android.ugc.aweme.comment.viewerlist.adapter;

import X.AbstractC1386130mAt;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0C64;
import X.C0I0B;
import X.C0NYY;
import X.C0SY7;
import X.C0ZD9;
import X.C0ZDI;
import X.C0ZE7;
import X.C1260910iuv;
import X.C1260960iv0;
import X.C1264800j1C;
import X.C1336205Ku;
import X.C1350950lG9;
import X.C1356890lPj;
import X.C1357100lQ4;
import X.C1387050mCN;
import X.C1388190mED;
import X.C13LE;
import X.C1400340mXo;
import X.C1402390mb7;
import X.C19651011uW;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C560910LzF;
import X.C724240Sb0;
import X.C729510SjV;
import X.C735840Sti;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C894700Z8a;
import X.C897490ZIt;
import X.C897520ZIw;
import X.C946803n0;
import X.EnumC1260930iux;
import X.EnumC1387060mCO;
import X.EnumC1910440zoY;
import X.EnumC896030ZDd;
import X.InterfaceC1357410lQZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC896190ZDt;
import X.InterfaceC898240ZLq;
import Y.AObserverS224S0100000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.util.ActivityStatusLifecycleOwnerVM;
import com.ss.android.ugc.aweme.comment.viewerlist.adapter.VideoViewerCell;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoViewerCell extends PowerCell<C1356890lPj> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public User LLJI;
    public boolean LLJIJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public final String LLJJ;
    public final AObserverS224S0100000_21 LLJJI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 246));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 223));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 221));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 224));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 231));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 229));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 244));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 234));
    public String LLJ = "";
    public C894700Z8a LLJILJIL = C894700Z8a.LJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoViewerCell.class, "_activityStatusLifecycleOwnerVM", "get_activityStatusLifecycleOwnerVM()Lcom/ss/android/ugc/aweme/comment/util/ActivityStatusLifecycleOwnerVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoViewerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActivityStatusLifecycleOwnerVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 251);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(97);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 232), awS565S0100000_21, AFwS209S0000000_21.get$arr$(147), new AwS565S0100000_21((C03K6) this, 235), new AwS565S0100000_21((C03K6) this, 237), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 239), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 241), null, new AwS565S0100000_21((C03K6) this, 242));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 236);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 238);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 240);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 23));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 243);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 245);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 247);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 248);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 249);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 250), awS565S0100000_21, AFwS209S0000000_21.get$arr$(148), new AwS565S0100000_21((C03K6) this, 252), new AwS565S0100000_21((C03K6) this, 253), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 254), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 219), null, new AwS565S0100000_21((C03K6) this, 220));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 222), awS565S0100000_21, AFwS209S0000000_21.get$arr$(145), new AwS565S0100000_21((C03K6) this, 226), new AwS565S0100000_21((C03K6) this, 227), new AwS565S0100000_21((C03K6) this, 228), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 230));
        }
        this.LLJILJILJ = assemVMLazy;
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 233));
        this.LLJJ = "video_view_list";
        this.LLJJI = new AObserverS224S0100000_21(this, 26);
    }

    public final RelationLabelTextView S5() {
        return (RelationLabelTextView) this.LLILZIL.getValue();
    }

    public final TuxTextView T5() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    public final VideoViewerListVM U5() {
        return (VideoViewerListVM) this.LL.getValue();
    }

    public final void d6() {
        User user;
        String str;
        VideoViewerListVM videoViewerListVMU5;
        Set set;
        String aid;
        Set set2;
        C1356890lPj item = getItem();
        if (item == null) {
            return;
        }
        User user2 = item.LL;
        if (C1336205Ku.LIZ(false).getLightInteractService().LIZIZ(user2.getUid()) && (user = item.LL) != null && user.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue()) {
            RelationButton relationButton = (RelationButton) this.LLILZLL.getValue();
            String strLJJLIIIJJI = R5().LJJLIIIJJI(this.LLJJ);
            String str2 = "";
            if (strLJJLIIIJJI == null) {
                strLJJLIIIJJI = "";
            }
            String str3 = this.LLJJ;
            String uid = user2.getUid();
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            String strLJII = R5().LJII(strLJJLIIIJJI);
            if (strLJII.length() == 0) {
                strLJII = "nudge";
            }
            Function0<InterfaceC898240ZLq> tracker = relationButton.getTracker();
            String str4 = null;
            InterfaceC898240ZLq interfaceC898240ZLqInvoke = tracker != null ? tracker.invoke() : null;
            C1260960iv0 c1260960iv0 = interfaceC898240ZLqInvoke instanceof C1260960iv0 ? (C1260960iv0) interfaceC898240ZLqInvoke : null;
            InterfaceC1357410lQZ interfaceC1357410lQZLJIIZILJ = R5().LJIIZILJ("tag_video_viewer_list");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uid);
            sbLIZ.append(currentUserID);
            sbLIZ.append(str3);
            sbLIZ.append(strLJJLIIIJJI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (c1260960iv0 != null) {
                str4 = c1260960iv0.LIZIZ;
                str = c1260960iv0.LIZLLL;
            } else {
                str = null;
            }
            interfaceC1357410lQZLJIIZILJ.LIZIZ(strLIZIZ, str4, str, null, null, null, strLJII);
            VideoViewerListVM videoViewerListVMU52 = U5();
            if (videoViewerListVMU52 == null || (set2 = (Set) videoViewerListVMU52.LLILZLL.getValue()) == null || !set2.contains(user2.getUid())) {
                ILightInteractionPlatformService iLightInteractionPlatformServiceR5 = R5();
                String str5 = item.LLILLJJLI.LIZ;
                String strLJJLIIIJJI2 = R5().LJJLIIIJJI(this.LLJJ);
                if (strLJJLIIIJJI2 == null) {
                    strLJJLIIIJJI2 = "";
                }
                String str6 = this.LLJJ;
                String uid2 = item.LL.getUid();
                if (uid2 == null) {
                    uid2 = "";
                }
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                if (iLightInteractionPlatformServiceR5.LJJJJLI(str5, strLJJLIIIJJI2, str6, uid2, curUserId)) {
                    return;
                }
                IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
                EnumC896030ZDd enumC896030ZDd = EnumC896030ZDd.VIDEO_VIEW_LIST;
                String uid3 = user2.getUid();
                if (uid3 == null) {
                    uid3 = "";
                }
                Aweme aweme = item.LLILLJJLI.LIZIZ;
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    str2 = aid;
                }
                if (imNudgeAndStreakService.LJJIFFI(enumC896030ZDd, uid3, str2) || (videoViewerListVMU5 = U5()) == null || (set = (Set) videoViewerListVMU5.LLILZLL.getValue()) == null) {
                    return;
                }
                set.add(item.LL.getUid());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewerlist.adapter.VideoViewerCell.N5():void");
    }

    public final ActivityStatusLifecycleOwnerVM P5() {
        Fragment fragmentLJI;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner == null || (fragmentLJI = C724240Sb0.LJI(currentLifecycleOwner)) == null || !fragmentLJI.isAdded()) {
            return null;
        }
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (ActivityStatusLifecycleOwnerVM) assemVMLazy.getValue();
    }

    public final ILightInteractionPlatformService R5() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    public final void a6() {
        User user;
        VideoViewerListVM videoViewerListVMU5;
        Set set;
        Set set2;
        C1356890lPj item = getItem();
        if (item == null || (user = item.LL) == null) {
            return;
        }
        VideoViewerListVM videoViewerListVMU52 = U5();
        if ((videoViewerListVMU52 == null || (set2 = (Set) videoViewerListVMU52.LLILZIL.getValue()) == null || !set2.contains(user.getUid())) && X5(EnumC1260930iux.SHOW) && (videoViewerListVMU5 = U5()) != null && (set = (Set) videoViewerListVMU5.LLILZIL.getValue()) != null) {
            set.add(user.getUid());
        }
    }

    public final void c6() {
        User user;
        if (C560910LzF.LIZ()) {
            ActivityStatusLifecycleOwnerVM activityStatusLifecycleOwnerVMP5 = P5();
            String uid = null;
            C0ZE7 c0ze7 = new C0ZE7(activityStatusLifecycleOwnerVMP5 != null ? activityStatusLifecycleOwnerVMP5.LL : null);
            c0ze7.LIZIZ(EnumC1910440zoY.VIEW_LIST);
            c0ze7.LJII = Boolean.valueOf(this.LLJIJIL);
            C1356890lPj item = getItem();
            if (item != null && (user = item.LL) != null) {
                uid = user.getUid();
            }
            c0ze7.LIZJ = uid;
            C897490ZIt.LIZLLL(c0ze7);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C897520ZIw c897520ZIwVQ2;
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 0));
        VideoViewerListVM videoViewerListVMU5 = U5();
        if (videoViewerListVMU5 == null || (c897520ZIwVQ2 = videoViewerListVMU5.vQ2()) == null) {
            return;
        }
        c897520ZIwVQ2.LIZIZ(true, new C0NYY() { // from class: X.0lQa
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                C595660NXw c595660NXw;
                NextLiveData<Boolean> nextLiveDataWQ2;
                C1356890lPj item = this.LL.getItem();
                if (item != null && (c595660NXw = map.get(item.LL.getUid())) != null) {
                    this.LL.LLJIJIL = C896480ZEw.LIZJ(c595660NXw);
                    VideoViewerCell videoViewerCell = this.LL;
                    videoViewerCell.LLJILJIL = C896480ZEw.LIZ(c595660NXw, videoViewerCell.itemView.getContext(), 2);
                    VideoViewerCell videoViewerCell2 = this.LL;
                    if (videoViewerCell2.LLJIJIL) {
                        C339190DRl.LIZLLL((View) videoViewerCell2.LLILLL.getValue());
                        ((C19727912Gn) videoViewerCell2.LLILLL.getValue()).setActive(true);
                    } else {
                        C339190DRl.LIZIZ((View) videoViewerCell2.LLILLL.getValue());
                    }
                    C1356890lPj item2 = this.LL.getItem();
                    if (item2 != null) {
                        this.LL.L5(item2);
                    }
                    VideoViewerListVM videoViewerListVMU52 = this.LL.U5();
                    if (videoViewerListVMU52 != null && (nextLiveDataWQ2 = videoViewerListVMU52.wQ2()) != null && Intrinsics.LJFF(nextLiveDataWQ2.getValue(), true)) {
                        this.LL.c6();
                        this.LL.d6();
                    }
                    return Unit.LIZ;
                }
                return Unit.LIZ;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        LifecycleOwner lifecycleOwnerLIZIZ;
        NextLiveData<Boolean> nextLiveDataWQ2;
        NextLiveData<Boolean> nextLiveDataWQ22;
        boolean zLJI = MethodIDManager.LJI(202526);
        super.onViewAttachedToWindow();
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService == null || (lifecycleOwnerLIZIZ = iDetailFeedSafService.LIZ(this.itemView)) == null) {
            lifecycleOwnerLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        }
        VideoViewerListVM videoViewerListVMU5 = U5();
        if (videoViewerListVMU5 != null && (nextLiveDataWQ22 = videoViewerListVMU5.wQ2()) != null) {
            nextLiveDataWQ22.observe(lifecycleOwnerLIZIZ, this.LLJJI);
        }
        VideoViewerListVM videoViewerListVMU52 = U5();
        if (videoViewerListVMU52 != null && (nextLiveDataWQ2 = videoViewerListVMU52.wQ2()) != null && Intrinsics.LJFF(nextLiveDataWQ2.getValue(), Boolean.TRUE)) {
            a6();
            d6();
            c6();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        NextLiveData<Boolean> nextLiveDataWQ2;
        super.onViewDetachedFromWindow();
        VideoViewerListVM videoViewerListVMU5 = U5();
        if (videoViewerListVMU5 == null || (nextLiveDataWQ2 = videoViewerListVMU5.wQ2()) == null) {
            return;
        }
        nextLiveDataWQ2.removeObserver(this.LLJJI);
    }

    public final void I5(C1356890lPj c1356890lPj) {
        RelationButton relationButton = (RelationButton) this.LLILZLL.getValue();
        User user = this.LLJI;
        if (user != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LJIIJJI = C946803n0.LIZ(this.itemView);
            c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_AFTER_NUDGE;
            c1387050mCN.LJIIJ = C1264800j1C.LIZ(user);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
        }
        relationButton.setTracker(new AwS422S0200000_21(this, c1356890lPj, 143));
    }

    public final void L5(C1356890lPj c1356890lPj) {
        String uid;
        String uid2;
        InterfaceC898240ZLq interfaceC898240ZLqInvoke;
        C1260960iv0 c1260960iv0;
        String str;
        String str2;
        String aid;
        if (!C1350950lG9.LIZIZ.LJII()) {
            C786410Ut5.t0((RelationButton) this.LLILZLL.getValue(), 8);
            return;
        }
        ILightInteractionPlatformService iLightInteractionPlatformServiceR5 = R5();
        String str3 = c1356890lPj.LLILLJJLI.LIZ;
        String strLJJLIIIJJI = R5().LJJLIIIJJI(this.LLJJ);
        String str4 = "";
        if (strLJJLIIIJJI == null) {
            strLJJLIIIJJI = "";
        }
        String str5 = this.LLJJ;
        String uid3 = c1356890lPj.LL.getUid();
        if (uid3 == null) {
            uid3 = "";
        }
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (iLightInteractionPlatformServiceR5.LJJJJLI(str3, strLJJLIIIJJI, str5, uid3, curUserId)) {
            I5(c1356890lPj);
            return;
        }
        IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
        EnumC896030ZDd enumC896030ZDd = EnumC896030ZDd.VIDEO_VIEW_LIST;
        User user = this.LLJI;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        Aweme aweme = c1356890lPj.LLILLJJLI.LIZIZ;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str4 = aid;
        }
        if (imNudgeAndStreakService.LJJIFFI(enumC896030ZDd, uid, str4)) {
            I5(c1356890lPj);
            return;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_light_interaction_view_list_disappear", false) == 1) {
            I5(c1356890lPj);
            return;
        }
        User user2 = this.LLJI;
        if (user2 != null && R5().LJJJJI(user2)) {
            I5(c1356890lPj);
            return;
        }
        InterfaceC896190ZDt lightInteractService = C1336205Ku.LIZ(false).getLightInteractService();
        User user3 = this.LLJI;
        String str6 = null;
        if (user3 != null) {
            uid2 = user3.getUid();
        } else {
            uid2 = null;
        }
        if (lightInteractService.LIZIZ(uid2)) {
            RelationButton relationButton = (RelationButton) this.LLILZLL.getValue();
            relationButton.setTracker(new AwS422S0200000_21(this, c1356890lPj, 143));
            if (R5().LJJLIIIJJIZ()) {
                String strLJJLIIIJJI2 = R5().LJJLIIIJJI(this.LLJJ);
                if (strLJJLIIIJJI2 == null) {
                    W5(relationButton);
                    return;
                }
                Function0<InterfaceC898240ZLq> tracker = relationButton.getTracker();
                if (tracker != null) {
                    interfaceC898240ZLqInvoke = tracker.invoke();
                } else {
                    interfaceC898240ZLqInvoke = null;
                }
                if (interfaceC898240ZLqInvoke instanceof C1260960iv0) {
                    c1260960iv0 = (C1260960iv0) interfaceC898240ZLqInvoke;
                } else {
                    c1260960iv0 = null;
                }
                ILightInteractionPlatformService iLightInteractionPlatformServiceR52 = R5();
                String str7 = c1356890lPj.LLILLJJLI.LIZ;
                Pair[] pairArr = new Pair[3];
                if (c1260960iv0 != null) {
                    str = c1260960iv0.LJIILJJIL;
                } else {
                    str = null;
                }
                pairArr[0] = new Pair("position", str);
                if (c1260960iv0 != null) {
                    str2 = c1260960iv0.LIZIZ;
                } else {
                    str2 = null;
                }
                pairArr[1] = new Pair("enter_from", str2);
                if (c1260960iv0 != null) {
                    str6 = c1260960iv0.LIZLLL;
                }
                pairArr[2] = new Pair("enter_method", str6);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                String str8 = this.LLJJ;
                User user4 = c1356890lPj.LL;
                AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this, c1356890lPj, 142);
                String curUserId2 = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId2 == null) {
                    curUserId2 = "";
                }
                if (iLightInteractionPlatformServiceR52.LJJIZ(str7, relationButton, strLJJLIIIJJI2, mapLJIIIIZZ, str8, user4, curUserId2, true, null, null, null, null, awS422S0200000_21)) {
                    return;
                }
                I5(c1356890lPj);
                return;
            }
            W5(relationButton);
            return;
        }
        RelationButton relationButton2 = (RelationButton) this.LLILZLL.getValue();
        User user5 = this.LLJI;
        if (user5 != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(user5);
            c1387050mCN.LJIIJ = C1264800j1C.LIZ(user5);
            relationButton2.LLLLZIL(c1387050mCN.LIZ());
        }
        relationButton2.setTracker(new AwS565S0100000_21(c1356890lPj, 1709));
    }

    public final boolean V5(User user) {
        List<MutualUser> list;
        String str;
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
            if (mutualStruct != null) {
                list = mutualStruct.userList;
            } else {
                list = null;
            }
            if ((list != null && !list.isEmpty()) || ((str = matchedFriendStruct.recommendReason) != null && str.length() != 0)) {
                return true;
            }
        }
        return false;
    }

    public final void W5(RelationButton relationButton) {
        String uid;
        IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
        User user = this.LLJI;
        if (user != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_NUDGE;
            C0SY7 c0sy7 = C0SY7.FOLLOW_MUTUAL;
            c1387050mCN.LIZIZ(C2097908Jt.LIZJ(new Pair(c0sy7, imNudgeAndStreakService.LJIJJ())));
            Map<? extends C0SY7, ? extends Boolean> mapLIZJ = C2097908Jt.LIZJ(new Pair(c0sy7, Boolean.TRUE));
            Map<C0SY7, Boolean> map = c1387050mCN.LJIIIZ;
            if (mapLIZJ != null) {
                map.putAll(mapLIZJ);
            }
            c1387050mCN.LJIIJ = C1264800j1C.LIZ(user);
            C0ZDI c0zdi = C0ZDI.RELATION_BUTTON_COMBINE;
            EnumC896030ZDd enumC896030ZDd = EnumC896030ZDd.VIDEO_VIEW_LIST;
            User user2 = this.LLJI;
            if (user2 == null || (uid = user2.getUid()) == null) {
                uid = "";
            }
            c1387050mCN.LJIILL = new C0ZD9(c0zdi, enumC896030ZDd, false, null, null, uid, null, null, 220);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
        }
    }

    public final boolean X5(EnumC1260930iux enumC1260930iux) {
        String str;
        C1356890lPj item = getItem();
        int i = 0;
        if (item == null || !V5(item.LL)) {
            return false;
        }
        item.LL.getMatchedFriendStruct();
        if (C729510SjV.LJJ(item.LLILLJJLI.LIZIZ)) {
            str = "story";
        } else {
            str = "post";
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        Aweme aweme = item.LLILLJJLI.LIZIZ;
        c735840Sti.getClass();
        int iLJIIIZ = C735840Sti.LJIIIZ(aweme);
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(item.LLILLJJLI.LIZJ);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        C1357100lQ4 c1357100lQ4 = item.LLILLJJLI;
        String str2 = c1357100lQ4.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        c1260910iuv.LJJLIIIJLLLLLLLZ = str2;
        c1260910iuv.LJJJLZIJ = str;
        c1260910iuv.LJJL = iLJIIIZ;
        Aweme aweme2 = c1357100lQ4.LIZIZ;
        if (aweme2 != null && aweme2.getIsStoryToNormal()) {
            i = 1;
        }
        c1260910iuv.LJJLI = i;
        c1260910iuv.LJJJJZI(item.LL);
        c1260910iuv.LJJLIIIJILLIZJL = C1264800j1C.LIZJ();
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJJJIZL("video_views");
        Object objLJIIIZ = c19651011uW.LJIIIZ(item.LLILLJJLI.LIZIZ, c1260910iuv);
        C735840Sti.LIZIZ(item.LLILLJJLI.LIZIZ, objLJIIIZ);
        ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
        return true;
    }

    public final void b6(String str) {
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner;
        String str2;
        User user;
        String uid;
        C1357100lQ4 c1357100lQ4;
        if (!C560910LzF.LIZ()) {
            return;
        }
        ActivityStatusLifecycleOwnerVM activityStatusLifecycleOwnerVMP5 = P5();
        if (activityStatusLifecycleOwnerVMP5 != null) {
            activityStatusAnalyticsCommonLifecycleOwner = activityStatusLifecycleOwnerVMP5.LL;
        } else {
            activityStatusAnalyticsCommonLifecycleOwner = null;
        }
        C0ZE7 c0ze7 = new C0ZE7(activityStatusAnalyticsCommonLifecycleOwner);
        C1356890lPj item = getItem();
        String str3 = "";
        if (item == null || (c1357100lQ4 = item.LLILLJJLI) == null || (str2 = c1357100lQ4.LIZJ) == null) {
            str2 = "";
        }
        c0ze7.LIZLLL = str2;
        c0ze7.LJII = Boolean.valueOf(this.LLJIJIL);
        c0ze7.LIZIZ(EnumC1910440zoY.VIEW_LIST);
        c0ze7.LJFF = str;
        C1356890lPj item2 = getItem();
        if (item2 != null && (user = item2.LL) != null && (uid = user.getUid()) != null) {
            str3 = uid;
        }
        c0ze7.LIZJ = str3;
        C897490ZIt.LIZIZ(c0ze7);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r12) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewerlist.adapter.VideoViewerCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a38, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        NextLiveData<Boolean> nextLiveDataWQ2;
        boolean zLJI = MethodIDManager.LJI(202325);
        super.onResume(z);
        VideoViewerListVM videoViewerListVMU5 = U5();
        if (videoViewerListVMU5 != null && (nextLiveDataWQ2 = videoViewerListVMU5.wQ2()) != null && Intrinsics.LJFF(nextLiveDataWQ2.getValue(), Boolean.TRUE)) {
            c6();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
