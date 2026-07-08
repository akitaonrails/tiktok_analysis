package com.ss.android.ugc.aweme.upvote.util;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C06YN;
import X.C0A7T;
import X.C0AVZ;
import X.C0HZ9;
import X.C0XQ7;
import X.C1004160cEo;
import X.C1004800cFq;
import X.C1004810cFr;
import X.C1004820cFs;
import X.C1004840cFu;
import X.C1004850cFv;
import X.C1220000hqw;
import X.C1358700lSe;
import X.C1358720lSg;
import X.C1358880lSw;
import X.C1358930lT1;
import X.C1360460lVU;
import X.C1370970lmR;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C15X0;
import X.C1E8S;
import X.C20684815ws;
import X.C2205108kT;
import X.C263790AVl;
import X.C287250BNr;
import X.C291610Bbr;
import X.C298760BnO;
import X.C451610HnL;
import X.C452070Ho5;
import X.C581630MrZ;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737910Sx3;
import X.InterfaceC712990Rxx;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostBubbleTiming;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostBubbleTriggerStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility;
import com.ss.android.ugc.aweme.upvote.detail.vm.RepostCepRuleVM;
import com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class RepostLazyLoadUtil<T extends ReusedUIAssem<?> & InterfaceC712990Rxx<ITEM>, ITEM> {

    /* JADX INFO: Incorrect field signature: TT; */
    public final ReusedUIAssem LIZ;
    public final C13IQ<? extends ReusedAssem<?>> LIZIZ;
    public final AssemViewModel<C1358700lSe> LIZJ;
    public boolean LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public C1004160cEo LJI;
    public final CLACaptionAbility LJII;
    public IUpvoteGuideAbility LJIIIIZZ;
    public int LJIIIZ;
    public final C736950SvV LJIIJ;

    public final Aweme LIZIZ() {
        return ((VideoItemParams) this.LIZ.bo()).getAweme();
    }

    public final RepostEventVMNew LIZJ() {
        return (RepostEventVMNew) this.LJ.getValue();
    }

    public final void LJI() {
        String aid;
        Aweme aweme;
        User author;
        String uid;
        Aweme aweme2;
        C1358720lSg.LIZ.getClass();
        long j = C1358720lSg.LIZIZ().getLong(C1358720lSg.LIZ("recorded_block_timestamp"), 0L);
        long jLIZIZ = ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
        if (C2205108kT.LIZ(j, jLIZIZ)) {
            return;
        }
        C1004840cFu c1004840cFu = LIZJ().LLILZ;
        Object objBo = this.LIZ.bo();
        VideoItemParams videoItemParams = objBo instanceof VideoItemParams ? (VideoItemParams) objBo : null;
        c1004840cFu.getClass();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(videoItemParams != null ? videoItemParams.mEventType : null, "enter_from");
        pairArr[1] = new Pair("freq_control", "trigger");
        String str = "";
        if (videoItemParams == null || (aweme2 = videoItemParams.getAweme()) == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        pairArr[2] = new Pair(aid, "group_id");
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (author = aweme.getAuthor()) != null && (uid = author.getUid()) != null) {
            str = uid;
        }
        pairArr[3] = new Pair(str, "author_id");
        pairArr[4] = new Pair("bubble", "position");
        C20684815ws.LJIJI("recommend_entrance_show_freq_block", pairArr);
        C1358720lSg.LIZIZ().storeLong(C1358720lSg.LIZ("recorded_block_timestamp"), jLIZIZ);
    }

    public final boolean LIZ() {
        CLACaptionAbility cLACaptionAbility;
        User author;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C0HZ9.LIZ(LIZIZ().getAid())) {
            return false;
        }
        C1004840cFu c1004840cFu = LIZJ().LLILZ;
        if (c1004840cFu.LIZJ || c1004840cFu.LIZLLL || c1004840cFu.LJ) {
            return false;
        }
        C1358880lSw c1358880lSw = C1358880lSw.LIZ;
        String aid = LIZIZ().getAid();
        c1358880lSw.getClass();
        if (C1358880lSw.LJII(aid)) {
            return false;
        }
        if (C298760BnO.LIZ()) {
            C1358930lT1 c1358930lT1 = C1358930lT1.LIZ;
            Aweme aweme = ((VideoItemParams) this.LIZ.bo()).getAweme();
            c1358930lT1.getClass();
            if (!C1358930lT1.LIZ(aweme)) {
                return false;
            }
        } else if (!C1360460lVU.LIZIZ.LJJIIJZLJL(((VideoItemParams) this.LIZ.bo()).getAweme())) {
            return false;
        }
        if (!((Boolean) C0AVZ.LIZ.getValue()).booleanValue() && (author = LIZIZ().getAuthor()) != null && author.getFollowStatus() == 2) {
            return false;
        }
        if (C0A7T.LIZ() && (cLACaptionAbility = this.LJII) != null) {
            String aid2 = LIZIZ().getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            if (cLACaptionAbility.Cu2(aid2)) {
                return false;
            }
        }
        PoiDataStruct poiDataStruct = LIZIZ().getPoiDataStruct();
        return poiDataStruct == null || !poiDataStruct.tagShowed;
    }

    public final int LIZLLL() {
        RepostBubbleTiming repostBubbleTiming;
        List<RepostBubbleTriggerStruct> list;
        RepostBubbleTriggerStruct next;
        UpvoteInfo upvoteInfo = LIZIZ().getUpvoteInfo();
        Double d = null;
        if (upvoteInfo != null && (repostBubbleTiming = upvoteInfo.repostBubbleTiming) != null && (list = repostBubbleTiming.triggers) != null) {
            Iterator<RepostBubbleTriggerStruct> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(next.ruleName, "play_time")) {
                    break;
                }
            }
            RepostBubbleTriggerStruct repostBubbleTriggerStruct = next;
            if (repostBubbleTriggerStruct != null) {
                d = repostBubbleTriggerStruct.showTime;
            }
        }
        return (!((Boolean) C263790AVl.LIZ.getValue()).booleanValue() || d == null || d.doubleValue() <= 0.0d) ? C1004850cFv.LJFF : (int) d.doubleValue();
    }

    public final void LJIIIZ() {
        if (C287250BNr.LIZIZ() == 1) {
            LIZJ().LLILZ.getClass();
            if (C1004840cFu.LIZIZ()) {
                LJI();
                C1004160cEo c1004160cEo = this.LJI;
                if (c1004160cEo != null) {
                    c1004160cEo.LIZJ("repost_exit_strategy");
                    return;
                }
                return;
            }
        }
        if (!C287250BNr.LIZ()) {
            LIZJ().LLILZ.getClass();
            C1358720lSg c1358720lSg = C1358720lSg.LIZ;
            c1358720lSg.getClass();
            if (C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("digg_not_upvote_time_"), 0) >= ((Number) C1E8S.LIZLLL.getValue()).intValue()) {
                C1004160cEo c1004160cEo2 = this.LJI;
                if (c1004160cEo2 != null) {
                    c1004160cEo2.LIZJ("repost_frequency_control1");
                    return;
                }
                return;
            }
            LIZJ().LLILZ.getClass();
            c1358720lSg.getClass();
            if (C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("share_or_comment_upvote_time_"), 0) >= C1004850cFv.LIZJ) {
                C1004160cEo c1004160cEo3 = this.LJI;
                if (c1004160cEo3 != null) {
                    c1004160cEo3.LIZJ("repost_frequency_control2");
                    return;
                }
                return;
            }
        }
        LJIIJJI("like", null, false);
    }

    public final void LJIIJ() {
        if (C287250BNr.LIZIZ() == 1) {
            LIZJ().LLILZ.getClass();
            if (C1004840cFu.LIZIZ()) {
                LJI();
                return;
            }
        }
        if (!C287250BNr.LIZ()) {
            LIZJ().LLILZ.getClass();
            C1358720lSg c1358720lSg = C1358720lSg.LIZ;
            c1358720lSg.getClass();
            if (C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("share_or_comment_upvote_time_"), 0) >= C1004850cFv.LIZJ) {
                return;
            }
            LIZJ().LLILZ.getClass();
            c1358720lSg.getClass();
            if (C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("video_loop_not_upvote_time_"), 0) >= C1004850cFv.LIZLLL) {
                return;
            }
        }
        LJIIJJI("loop", null, false);
    }

    public final void LJ(String str) {
        FeedCommonService feedCommonService;
        if (!Intrinsics.LJFF(str, LIZIZ().getAid())) {
            return;
        }
        IInternalShareApi.LIZ.getClass();
        if (C1370970lmR.LIZ().LIZIZ().LJJII(LIZIZ())) {
            return;
        }
        FeedCommonService feedCommonService2 = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null);
        if ((feedCommonService2 != null && feedCommonService2.LJIIIZ()) || (feedCommonService = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null)) == null || !feedCommonService.LJIILL(LIZIZ(), ((VideoItemParams) this.LIZ.bo()).mEventType)) {
            if (!LIZ()) {
                C1004160cEo c1004160cEo = this.LJI;
                if (c1004160cEo != null) {
                    c1004160cEo.LIZJ("check_not_should_guide_upvote");
                    return;
                }
                return;
            }
            C291610Bbr.LIZ.getClass();
            if ((C291610Bbr.LIZ() & 4) == 4) {
                C15X0.LIZ.getClass();
                if (C15X0.LIZJ()) {
                    LJIIIIZZ(str, "like");
                    return;
                }
            }
            if (!C1004850cFv.LJ) {
                LJIIIZ();
                return;
            }
            C1004160cEo c1004160cEo2 = this.LJI;
            if (c1004160cEo2 == null) {
                return;
            }
            c1004160cEo2.LIZJ("finial_check_not_should_guide_upvote");
        }
    }

    public final void LJFF(C581630MrZ c581630MrZ) {
        String aid;
        IInternalShareApi.LIZ.getClass();
        if (!C1370970lmR.LIZ().LIZIZ().LJJII(LIZIZ()) && c581630MrZ != null && c581630MrZ.LIZ == 7 && LIZ() && Intrinsics.LJFF(LIZIZ().getAid(), c581630MrZ.LIZJ) && (aid = LIZIZ().getAid()) != null && aid.length() != 0) {
            this.LJIIIZ++;
            C1004840cFu c1004840cFu = LIZJ().LLILZ;
            c1004840cFu.getClass();
            C01GW c01gw = C1E8S.LIZJ;
            int iIntValue = ((Number) c01gw.getValue()).intValue();
            int i = c1004840cFu.LIZ;
            if (iIntValue >= i) {
                c1004840cFu.LIZ = i + 1;
            }
            ((Number) c01gw.getValue()).intValue();
            if (LIZJ().LLILZ.LIZ == 1) {
                C291610Bbr.LIZ.getClass();
                if ((C291610Bbr.LIZ() & 1) == 1) {
                    C15X0.LIZ.getClass();
                    if (C15X0.LIZJ()) {
                        LJIIIIZZ(c581630MrZ.LIZJ, "oneLoop");
                        return;
                    }
                    return;
                }
                return;
            }
            if (LIZJ().LLILZ.LIZ == 2) {
                C291610Bbr.LIZ.getClass();
                if ((C291610Bbr.LIZ() & 2) == 2) {
                    C15X0.LIZ.getClass();
                    if (C15X0.LIZJ()) {
                        LJIIIIZZ(c581630MrZ.LIZJ, "loop");
                        return;
                    }
                }
                if (!C1004850cFv.LJ) {
                    LJIIJ();
                }
            }
        }
    }

    public final void LJII(String str) {
        if (Intrinsics.LJFF(str, "like")) {
            LJIIIZ();
        } else {
            if (!Intrinsics.LJFF(str, "loop")) {
                return;
            }
            LJIIJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:5:0x002f, B:7:0x003d, B:9:0x0043, B:12:0x004a, B:14:0x004f, B:17:0x0056, B:24:0x006f, B:25:0x0080, B:27:0x0086, B:28:0x0088, B:31:0x0098, B:32:0x00a9, B:34:0x00af, B:48:0x00e0, B:37:0x00b8, B:39:0x00c0, B:41:0x00c4, B:42:0x00c8, B:44:0x00d3, B:47:0x00dd, B:46:0x00d7), top: B:62:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:5:0x002f, B:7:0x003d, B:9:0x0043, B:12:0x004a, B:14:0x004f, B:17:0x0056, B:24:0x006f, B:25:0x0080, B:27:0x0086, B:28:0x0088, B:31:0x0098, B:32:0x00a9, B:34:0x00af, B:48:0x00e0, B:37:0x00b8, B:39:0x00c0, B:41:0x00c4, B:42:0x00c8, B:44:0x00d3, B:47:0x00dd, B:46:0x00d7), top: B:62:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:5:0x002f, B:7:0x003d, B:9:0x0043, B:12:0x004a, B:14:0x004f, B:17:0x0056, B:24:0x006f, B:25:0x0080, B:27:0x0086, B:28:0x0088, B:31:0x0098, B:32:0x00a9, B:34:0x00af, B:48:0x00e0, B:37:0x00b8, B:39:0x00c0, B:41:0x00c4, B:42:0x00c8, B:44:0x00d3, B:47:0x00dd, B:46:0x00d7), top: B:62:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:5:0x002f, B:7:0x003d, B:9:0x0043, B:12:0x004a, B:14:0x004f, B:17:0x0056, B:24:0x006f, B:25:0x0080, B:27:0x0086, B:28:0x0088, B:31:0x0098, B:32:0x00a9, B:34:0x00af, B:48:0x00e0, B:37:0x00b8, B:39:0x00c0, B:41:0x00c4, B:42:0x00c8, B:44:0x00d3, B:47:0x00dd, B:46:0x00d7), top: B:62:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r13, final java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil.LJIIIIZZ(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/13IQ<+Lcom/bytedance/assem/arch/reused/ReusedAssem<*>;>;Lcom/bytedance/assem/arch/viewModel/AssemViewModel<LX/0lSe;>;)V */
    public RepostLazyLoadUtil(ReusedUIAssem reusedUIAssem, C13IQ c13iq, AssemViewModel assemViewModel) {
        this.LIZ = reusedUIAssem;
        this.LIZIZ = c13iq;
        this.LIZJ = assemViewModel;
        this.LJ = C737910Sx3.LIZJ(reusedUIAssem, C13LE.LIZ(RepostEventVMNew.class), new C1004810cFr());
        this.LJFF = C737910Sx3.LIZJ(reusedUIAssem, C13LE.LIZ(InterceptorEventViewModel.class), new C1004800cFq());
        this.LJII = (CLACaptionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), CLACaptionAbility.class, null);
        this.LJIIJ = new C736950SvV(C13LE.LIZ(RepostCepRuleVM.class), null, new C452070Ho5(), C724750Sbp.LJII(reusedUIAssem), C1220000hqw.LIZ(reusedUIAssem instanceof HasDefaultViewModelProviderFactory ? reusedUIAssem : null), new C1004820cFs(), new C06YN(reusedUIAssem), new C451610HnL(reusedUIAssem, true, true), new C723700Sa8(reusedUIAssem));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            com.bytedance.assem.arch.reused.ReusedUIAssem r3 = r5.LIZ
            boolean r0 = r5.LIZLLL
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L94
            X.13IQ<? extends com.bytedance.assem.arch.reused.ReusedAssem<?>> r0 = r5.LIZIZ
            X.C723830SaL.LJ(r3, r0, r2, r1)
            r5.LIZLLL = r2
            r4 = 0
        L10:
            int r3 = r6.hashCode()
            r0 = -1321449942(0xffffffffb13c462a, float:-2.7397484E-9)
            if (r3 == r0) goto L7a
            r0 = 3321751(0x32af97, float:4.654765E-39)
            if (r3 == r0) goto L69
            r0 = 3327652(0x32c6a4, float:4.663034E-39)
            if (r3 != r0) goto L8b
            java.lang.String r0 = "loop"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r5.LIZJ()
            X.0cFu r0 = r0.LLILZ
            r0.LJII = r2
        L33:
            if (r4 != 0) goto L4d
            com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility r0 = r5.LJIIIIZZ
            if (r0 != 0) goto L49
            com.bytedance.assem.arch.reused.ReusedUIAssem r0 = r5.LIZ
            X.0Q7z r2 = X.C1558520qew.LJIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility> r0 = com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility r0 = (com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility) r0
            r5.LJIIIIZZ = r0
        L49:
            com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility r0 = r5.LJIIIIZZ
            if (r0 == 0) goto L68
        L4d:
            com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility r0 = r5.LJIIIIZZ
            if (r0 != 0) goto L61
            com.bytedance.assem.arch.reused.ReusedUIAssem r0 = r5.LIZ
            X.0Q7z r2 = X.C1558520qew.LJIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility> r0 = com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility r0 = (com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility) r0
            r5.LJIIIIZZ = r0
        L61:
            com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility r0 = r5.LJIIIIZZ
            if (r0 == 0) goto L68
            r0.Bf0(r6, r7, r8)
        L68:
            return
        L69:
            java.lang.String r0 = "like"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r5.LIZJ()
            X.0cFu r0 = r0.LLILZ
            r0.LJFF = r2
            goto L33
        L7a:
            java.lang.String r0 = "oneLoop"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r5.LIZJ()
            X.0cFu r0 = r0.LLILZ
            r0.LJI = r2
            goto L33
        L8b:
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r5.LIZJ()
            X.0cFu r0 = r0.LLILZ
            r0.LJIIIIZZ = r6
            goto L33
        L94:
            r4 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil.LJIIJJI(java.lang.String, java.lang.String, boolean):void");
    }
}
