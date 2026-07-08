package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem;

import X.AbstractC1387200mCc;
import X.AbstractC1585810rMx;
import X.AbstractC502430Jn7;
import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0JU4;
import X.C0K9Q;
import X.C0UO0;
import X.C1143204da;
import X.C1161920gLG;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C12969055r;
import X.C1388190mED;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C16FZ;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C1CC2;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C464660IKa;
import X.C480460Ism;
import X.C481090Itn;
import X.C491870JQr;
import X.C494680Jac;
import X.C500260Jjc;
import X.C501700Jlw;
import X.C502870Jnp;
import X.C503360Joc;
import X.C503430Joj;
import X.C503760JpG;
import X.C503780JpI;
import X.C504080Jpm;
import X.C504090Jpn;
import X.C504100Jpo;
import X.C504120Jpq;
import X.C504130Jpr;
import X.C504140Jps;
import X.C504160Jpu;
import X.C504190Jpx;
import X.C504200Jpy;
import X.C504210Jpz;
import X.C504220Jq0;
import X.C504240Jq2;
import X.C504290Jq7;
import X.C504340JqC;
import X.C504440JqM;
import X.C504510JqT;
import X.C510380Jzw;
import X.C520040KaQ;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import X.EnumC510330Jzr;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveGuidanceChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.CommentSendReq;
import webcast.api.sub.PostCreateReq;
import webcast.api.sub.PostCreateResp;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedAssem extends UISlotAssem implements SubSpaceFeedAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public C504510JqT LLJJIII;
    public RecyclerView LLJJIJI;
    public C481090Itn LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public boolean LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceFeedAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubSpaceFeedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12969055r(c19719912DlLIZ), new C504240Jq2(), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new C504200Jpy());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hoh;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void LJIIL() {
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJIJIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void LJJLI() {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), "sslocal://webcast_webview?url=https%3A%2F%2Fwww.tiktok.com%2Fcommunity-guidelines&height=484&gravity=bottom&radius=8&type=popup&show_mask=1&mask_bg_color=00000099&use_spark=1");
    }

    public final C504510JqT ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504510JqT.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubSpaceFeedVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    public final void LJ() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null && frameLayout.getChildCount() == 0) {
            C16FZ c16fz = new C16FZ(context, null);
            FrameLayout frameLayout2 = this.LLJJIJIL;
            if (frameLayout2 != null) {
                frameLayout2.addView(c16fz);
            }
        }
        FrameLayout frameLayout3 = this.LLJJIJIL;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(0, frameLayout3);
        }
    }

    public final void hp() {
        String str;
        C0J1N c0j1n;
        final SubSpaceFeedVM subSpaceFeedVMKp = kp();
        final C504130Jpr c504130Jpr = new C504130Jpr(this);
        final C504080Jpm c504080Jpm = new C504080Jpm(this);
        C504510JqT c504510JqTVQ2 = subSpaceFeedVMKp.vQ2();
        if (c504510JqTVQ2 != null && (str = c504510JqTVQ2.LLILZ) != null && str.length() != 0) {
            C480460Ism.LIZ().getClass();
            C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).getSpaceHome(str).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "SubSpaceFeedVM", "sub/space/homepage", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
            if (c11nzLJIILJJIL == null || (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceFeedVMKp))) == null) {
                return;
            }
            c0j1n.LIZ(new C09JN() { // from class: X.0JqL
                /* JADX WARN: Removed duplicated region for block: B:283:0x039b  */
                /* JADX WARN: Removed duplicated region for block: B:286:0x03b7  */
                /* JADX WARN: Removed duplicated region for block: B:294:0x03d5  */
                /* JADX WARN: Removed duplicated region for block: B:297:0x03e6  */
                /* JADX WARN: Removed duplicated region for block: B:301:0x03f9  */
                /* JADX WARN: Removed duplicated region for block: B:303:0x03fd  */
                /* JADX WARN: Removed duplicated region for block: B:321:0x043a  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r12) {
                    /*
                        Method dump skipped, instruction units count: 1098
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C504430JqL.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.07y0
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.fetchHomeData$2");
                    c504080Jpm.invoke(obj);
                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.fetchHomeData$2");
                }
            });
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterFrom:");
        C504510JqT c504510JqTVQ22 = subSpaceFeedVMKp.vQ2();
        sbLIZ.append(c504510JqTVQ22 != null ? c504510JqTVQ22.LLJIJIL : null);
        sbLIZ.append(" liveRoom:");
        C504510JqT c504510JqTVQ23 = subSpaceFeedVMKp.vQ2();
        sbLIZ.append(c504510JqTVQ23 != null ? Boolean.valueOf(c504510JqTVQ23.LLILZIL) : null);
        sbLIZ.append(" Owner:");
        C504510JqT c504510JqTVQ24 = subSpaceFeedVMKp.vQ2();
        sbLIZ.append(c504510JqTVQ24 != null ? Boolean.valueOf(c504510JqTVQ24.LLJ) : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IllegalStateException illegalStateException = new IllegalStateException(strLIZIZ);
        C1CC2.LIZ(strLIZIZ, illegalStateException);
        c504080Jpm.invoke(illegalStateException);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), SubSpaceFeedAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        Fragment fragmentLJI;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        if ((C504210Jpz.LIZ || C464660IKa.LIZ()) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        return context;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gh(long r10) {
        /*
            r9 = this;
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM r5 = r9.kp()
            X.0JpG r7 = r5.LLILZIL
            if (r7 == 0) goto L8e
            X.0JoS r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            java.util.ArrayList<X.0JpL> r8 = r0.LL
            if (r8 == 0) goto L8e
            java.util.Iterator r4 = r8.iterator()
            r3 = 0
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r4.next()
            X.0JpL r0 = (X.AbstractC503810JpL) r0
            long r1 = r0.LIZIZ()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L2d
            int r3 = r3 + 1
            goto L15
        L2c:
            r3 = -1
        L2d:
            int r6 = r3 + (-1)
        L2f:
            if (r3 < 0) goto L57
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r8, r3)
            X.0JoS r0 = r7.LLILLL
            if (r0 == 0) goto L3b
            r0.notifyItemRemoved(r3)
        L3b:
            java.util.Iterator r4 = r8.iterator()
            r3 = 0
        L40:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r4.next()
            X.0JpL r0 = (X.AbstractC503810JpL) r0
            long r1 = r0.LIZIZ()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L2f
            int r3 = r3 + 1
            goto L40
        L57:
            X.0JoS r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            java.util.ArrayList<X.0JpL> r4 = r0.LL
            if (r4 == 0) goto L8e
            r1 = 0
            if (r6 < 0) goto La4
            int r0 = r4.size()
            if (r0 <= r6) goto La4
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r6)
            boolean r0 = r3 instanceof X.C502400Jn4
            if (r0 == 0) goto La4
        L70:
            int r2 = r6 + 1
            if (r2 < 0) goto L97
            int r0 = r4.size()
            if (r0 <= r2) goto L97
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            boolean r0 = r1 instanceof X.C502400Jn4
            if (r0 == 0) goto L97
            if (r1 == 0) goto L97
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r2)
            X.0JoS r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            r0.notifyItemRemoved(r2)
        L8e:
            X.0Jq4 r0 = new X.0Jq4
            r0.<init>()
            r5.setState(r0)
            return
        L97:
            if (r3 == 0) goto L8e
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r6)
            X.0JoS r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            r0.notifyItemRemoved(r6)
            goto L8e
        La4:
            r3 = r1
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem.Gh(long):void");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void bG2(final PostCreateReq postCreateReq) {
        LJ();
        final SubSpaceFeedVM subSpaceFeedVMKp = kp();
        final C504220Jq0 c504220Jq0 = new C504220Jq0(this);
        final C504100Jpo c504100Jpo = new C504100Jpo(this);
        C480460Ism.LIZ().getClass();
        C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).sendPost(postCreateReq), EnumC510330Jzr.GENERAL, "SubSpaceFeedVM", "sub/space/post/create", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceFeedVMKp));
        if (c0j1n != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0Jq1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    SpacePost spacePost;
                    boolean zLIZJ;
                    String str;
                    Long lValueOf;
                    SpaceTopicContent spaceTopicContent;
                    SpaceTopicCategory spaceTopicCategory;
                    SpacePost spacePost2;
                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.senPost$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    InterfaceC665370Q7z interfaceC665370Q7z = subSpaceFeedVMKp.LL;
                    String str2 = null;
                    if (interfaceC665370Q7z == null) {
                        interfaceC665370Q7z = null;
                    }
                    SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
                    if (subSpaceFeedAbility != null) {
                        PostCreateResp.ResponseData responseData = (PostCreateResp.ResponseData) baseResponse.data;
                        if (responseData != null) {
                            spacePost2 = responseData.post;
                        } else {
                            spacePost2 = null;
                        }
                        subSpaceFeedAbility.jn(spacePost2);
                    }
                    c504220Jq0.invoke();
                    C504450JqN c504450JqNWQ2 = subSpaceFeedVMKp.wQ2();
                    PostCreateResp.ResponseData responseData2 = (PostCreateResp.ResponseData) baseResponse.data;
                    if (responseData2 != null) {
                        spacePost = responseData2.post;
                    } else {
                        spacePost = null;
                    }
                    PostCreateReq postCreateReq2 = postCreateReq;
                    C503760JpG c503760JpG = subSpaceFeedVMKp.LLILZIL;
                    if (c503760JpG != null) {
                        zLIZJ = c503760JpG.LIZJ();
                    } else {
                        zLIZJ = 0;
                    }
                    c504450JqNWQ2.getClass();
                    if (spacePost != null) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_newpost_publish");
                        c474500IjALIZ.LJJII(C504450JqN.LIZIZ(spacePost), "post_type");
                        SpaceTopicInfo spaceTopicInfo = postCreateReq2.topicInfo;
                        if (spaceTopicInfo != null && (spaceTopicCategory = spaceTopicInfo.spaceTopicCategory) != null) {
                            str = spaceTopicCategory.topicCategoryText;
                        } else {
                            str = null;
                        }
                        c474500IjALIZ.LJJII(str, "topic_type");
                        SpaceTopicInfo spaceTopicInfo2 = postCreateReq2.topicInfo;
                        if (spaceTopicInfo2 != null && (spaceTopicContent = spaceTopicInfo2.spaceTopicContent) != null) {
                            lValueOf = Long.valueOf(spaceTopicContent.topicContentId);
                        } else {
                            lValueOf = null;
                        }
                        c474500IjALIZ.LJJII(lValueOf, "template_id");
                        c474500IjALIZ.LJJII(Integer.valueOf(!zLIZJ), "is_first_publish");
                        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "anchor_id");
                        C504510JqT c504510JqT = c504450JqNWQ2.LIZ;
                        if (c504510JqT != null) {
                            str2 = c504510JqT.LLJIJIL;
                        }
                        c474500IjALIZ.LJJII(str2, "space_show_entrance");
                        c474500IjALIZ.LIZ();
                    }
                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.senPost$1");
                }
            }, new C09JN() { // from class: X.07y2
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.senPost$2");
                    c504100Jpo.invoke(obj);
                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.senPost$2");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void jn(SpacePost spacePost) {
        SubSpaceFeedVM subSpaceFeedVMKp = kp();
        if (spacePost != null) {
            subSpaceFeedVMKp.setState(new C504290Jq7(spacePost));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0JoS, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final C503760JpG c503760JpG;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Jq9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILLL;
            }
        }, null, new C503430Joj(this), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0JqA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLIZLLLIL;
            }
        }, null, new C501700Jlw(), 6);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJI(c19egLIZ, null), this, SubSpaceFeedAbility.class, null, null);
        }
        this.LLJJIJIL = (FrameLayout) view.findViewById(R.id.nlo);
        ((C491870JQr) this.LLJJJIL.getValue()).LIZIZ(view, new C504120Jpq(this));
        C723850SaN.LIZLLL(this, new C504160Jpu(this));
        if (!kp().zQ2()) {
            C723850SaN.LIZLLL(this, new C1143204da(this));
        }
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hui);
        this.LLJJIJI = recyclerView;
        if (recyclerView != 0 && (c503760JpG = kp().LLILZIL) != null) {
            ?? r3 = new AbstractC502430Jn7(new ArrayList(), c503760JpG.LL, c503760JpG.LLILLJJLI) { // from class: X.0JoS
                public final SubSpaceFeedVM LLILLJJLI;
                public final C504510JqT LLILLL;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC503810JpL) ListProtector.get(this.LL, i)).LIZJ().getValue();
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C502700JnY c502700JnY;
                    if ((viewHolder instanceof C502700JnY) && (c502700JnY = (C502700JnY) viewHolder) != null) {
                        c502700JnY.I5((AbstractC503810JpL) ListProtector.get(this.LL, i), this.LLILLL);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder c502700JnY;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == EnumC503250JoR.HEADER.getValue()) {
                        c502700JnY = new C505570JsB(C786410Ut5.Td(layoutInflaterNe, R.layout.hp1, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.SUB_ONLY_VIDEO.getValue()) {
                        c502700JnY = new C503990Jpd(C786410Ut5.Td(layoutInflaterNe, R.layout.hp6, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.TEXT.getValue()) {
                        c502700JnY = new C503390Jof(C786410Ut5.Td(layoutInflaterNe, R.layout.hp7, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.COMMENT.getValue()) {
                        c502700JnY = new C503280JoU(C786410Ut5.Td(layoutInflaterNe, R.layout.hox, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POLL.getValue()) {
                        c502700JnY = new C503380Joe(C786410Ut5.Td(layoutInflaterNe, R.layout.hp4, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POLL_ITEM.getValue()) {
                        c502700JnY = new C503560Jow(C786410Ut5.Td(layoutInflaterNe, R.layout.hp5, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.POST_BTM_ACTION.getValue()) {
                        c502700JnY = new C503910JpV(C786410Ut5.Td(layoutInflaterNe, R.layout.hov, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.DIVIDER.getValue()) {
                        c502700JnY = new C502410Jn5(C786410Ut5.Td(layoutInflaterNe, R.layout.hoz, viewGroup, false));
                    } else if (i == EnumC503250JoR.LOAD_MORE.getValue()) {
                        c502700JnY = new C502580JnM(C786410Ut5.Td(layoutInflaterNe, R.layout.hp3, viewGroup, false));
                    } else if (i == EnumC503250JoR.EMPTY.getValue()) {
                        c502700JnY = new C503310JoX(C786410Ut5.Td(layoutInflaterNe, R.layout.hp0, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.BLOCK_CONTENT_ITEM.getValue()) {
                        c502700JnY = new C503330JoZ(C786410Ut5.Td(layoutInflaterNe, R.layout.hou, viewGroup, false), this.LLILLJJLI);
                    } else if (i == EnumC503250JoR.MOCK_TIP_TEXT.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hp9, viewGroup, false);
                        final SubSpaceFeedVM subSpaceFeedVM = this.LLILLJJLI;
                        c502700JnY = new C502700JnY(viewTd, subSpaceFeedVM) { // from class: X.0JoV
                            public final View LL;
                            public final SubSpaceFeedVM LLILLJJLI;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = subSpaceFeedVM;
                            }

                            @Override // X.C502700JnY
                            public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
                                int i2;
                                View viewFindViewById = this.LL.findViewById(R.id.kmd);
                                if (viewFindViewById != null) {
                                    viewFindViewById.setBackground(C507390Jv7.LIZ((int) C497740JfY.LIZIZ(8.0f), C20736316Cj.LIZIZ(R.attr.ey_, this.LL.getContext()), 0, (int) C497740JfY.LIZIZ(0.0f)));
                                }
                                TextView textView = (TextView) this.LL.findViewById(R.id.xyu);
                                if (textView != null) {
                                    if (this.LLILLJJLI.DQ2()) {
                                        i2 = 2131856650;
                                    } else {
                                        i2 = 2131849266;
                                    }
                                    textView.setText(C497740JfY.LJIJI(i2));
                                }
                            }
                        };
                    } else if (i == EnumC503250JoR.SPACE_ACTIVITY_INDICATOR.getValue()) {
                        c502700JnY = new C504660Jqi(C786410Ut5.Td(layoutInflaterNe, R.layout.ho6, viewGroup, false), this.LLILLJJLI);
                    } else {
                        c502700JnY = new C502700JnY(new FrameLayout(viewGroup.getContext()));
                    }
                    try {
                        View view2 = c502700JnY.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c502700JnY.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c502700JnY.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(c502700JnY.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c502700JnY.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c502700JnY.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = c502700JnY.getClass().getName();
                    return c502700JnY;
                }

                {
                    this.LLILLJJLI = subSpaceFeedVM;
                    this.LLILLL = c504510JqT;
                }
            };
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(r3);
            c503760JpG.LLILLL = r3;
            ((C502870Jnp) c503760JpG.LLILZ.getValue()).LIZ(recyclerView);
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0Jpc
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                    int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                    C503760JpG c503760JpG2 = c503760JpG;
                    if (c503760JpG2.LLILZIL != iFindFirstCompletelyVisibleItemPosition) {
                        SubSpaceFeedVM subSpaceFeedVM = c503760JpG2.LL;
                        subSpaceFeedVM.getClass();
                        subSpaceFeedVM.setState(new C504250Jq3(iFindFirstCompletelyVisibleItemPosition));
                        c503760JpG.LLILZIL = iFindFirstCompletelyVisibleItemPosition;
                    }
                }
            });
            final C504440JqM c504440JqM = (C504440JqM) c503760JpG.LLILZLL.getValue();
            c504440JqM.getClass();
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0Jpw
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                    if (i == 0) {
                        c504440JqM.LIZ(recyclerView2);
                    }
                }
            });
            C786410Ut5.x3(recyclerView.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0Jpp
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    LinearLayoutManager linearLayoutManager2;
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager2 = (LinearLayoutManager) layoutManager) == null || linearLayoutManager2.findLastVisibleItemPosition() <= 0) {
                        return;
                    }
                    C786410Ut5.C3(recyclerView.getViewTreeObserver(), this);
                    c504440JqM.LIZ(recyclerView);
                }
            });
        }
        LJ();
        hp();
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0JtY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILLJJLI;
            }
        }, null, new C503780JpI(this), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0JqB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILZ;
            }
        }, null, new C503360Joc(this), 6);
        this.LLJJIJIIJIL = (C481090Itn) view.findViewById(R.id.wsc);
        C504510JqT c504510JqTIp = ip();
        if (c504510JqTIp != null && C500260Jjc.LJJJI(Boolean.valueOf(c504510JqTIp.LLJJIJI))) {
            C481090Itn c481090Itn = this.LLJJIJIIJIL;
            if (c481090Itn != null) {
                c481090Itn.setNestedHeader(null);
            }
            C481090Itn c481090Itn2 = this.LLJJIJIIJIL;
            if (c481090Itn2 != null) {
                c481090Itn2.setOverScrollMode(EnumC19356710o9.NONE);
            }
            C481090Itn c481090Itn3 = this.LLJJIJIIJIL;
            if (c481090Itn3 != null) {
                c481090Itn3.setScrollMode(EnumC481060Itk.NONE);
            }
            C481090Itn c481090Itn4 = this.LLJJIJIIJIL;
            if (c481090Itn4 != null) {
                c481090Itn4.setNestedScrollingEnabled(true);
            }
        } else {
            C481090Itn c481090Itn5 = this.LLJJIJIIJIL;
            if (c481090Itn5 != null) {
                c481090Itn5.setRefreshing(true);
            }
            C481090Itn c481090Itn6 = this.LLJJIJIIJIL;
            if (c481090Itn6 != null) {
                c481090Itn6.setOnRefreshListener(new C504340JqC(this));
            }
        }
        ISubscriptionStatusService.LJIIIZ.getClass();
        C0K9Q.LIZ().cp1(this, this).LIZIZ(this, new C504140Jps(this));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void xX1(boolean z) {
        C19EG c19egLIZIZ;
        if (z) {
            DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyLiveSwitchChannel.class, Boolean.TRUE);
            C494680Jac.LIZ = true;
        } else {
            C494680Jac.LJIJJ(true);
        }
        C494680Jac.LJIL(true);
        DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyLiveGuidanceChannel.class, Boolean.TRUE);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), "sslocal://openShoot?enter_from=direct_shoot&tab=live");
        C784440Upu.LIZ().LIZIZ(new C0JU4(0));
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            c19egLIZIZ.finish();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void t50(CommentSendReq commentSendReq, final SpacePost spacePost) {
        C0J1N c0j1n;
        LJ();
        final SubSpaceFeedVM subSpaceFeedVMKp = kp();
        final C504190Jpx c504190Jpx = new C504190Jpx(this);
        final C504090Jpn c504090Jpn = new C504090Jpn(this);
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).sendComment(commentSendReq).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "SubSpaceFeedVM", "sub/space/comment/send", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
        if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceFeedVMKp))) != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0JpS
                /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.String r11 = "SubSpaceFeedVM@e7dc.sendComment$1"
                        X.C1C7U.LIZ(r11)
                        com.bytedance.android.live.network.response.BaseResponse r13 = (com.bytedance.android.live.network.response.BaseResponse) r13
                        com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM r1 = r1
                        T r0 = r13.data
                        webcast.api.sub.CommentSendResp$ResponseData r0 = (webcast.api.sub.CommentSendResp.ResponseData) r0
                        if (r0 == 0) goto L8b
                        com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r8 = r0.comment
                    L11:
                        com.bytedance.android.livesdk.chatroom.api.SpacePost r7 = r2
                        if (r8 != 0) goto L21
                        r1.getClass()
                    L18:
                        kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3
                        r0.invoke()
                        X.C1C7U.LIZIZ(r11)
                        return
                    L21:
                        X.0JpG r6 = r1.LLILZIL
                        if (r6 == 0) goto L18
                        X.0JoS r0 = r6.LLILLL
                        if (r0 == 0) goto L18
                        java.util.ArrayList<X.0JpL> r5 = r0.LL
                        if (r5 == 0) goto L18
                        com.bytedance.android.livesdk.chatroom.api.SpacePoll r0 = r7.pollInfo
                        if (r0 == 0) goto L6d
                        int r0 = r5.size()
                        java.util.ListIterator r9 = r5.listIterator(r0)
                    L39:
                        boolean r0 = r9.hasPrevious()
                        if (r0 == 0) goto L18
                        java.lang.Object r1 = r9.previous()
                        X.0JpL r1 = (X.AbstractC503810JpL) r1
                        boolean r0 = r1 instanceof X.C503080JoA
                        if (r0 == 0) goto L39
                        X.0JoA r1 = (X.C503080JoA) r1
                        com.bytedance.android.livesdk.chatroom.api.SpacePost r0 = r1.LIZ
                        long r2 = r0.postId
                        long r0 = r7.postId
                        int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                        if (r4 != 0) goto L39
                        int r9 = r9.nextIndex()
                    L59:
                        if (r9 < 0) goto L18
                        int r1 = r9 + 1
                        X.0Jr7 r0 = new X.0Jr7
                        r0.<init>(r8, r7)
                        com.bytedance.mt.protector.impl.collections.ListProtector.add(r5, r1, r0)
                        X.0JoS r0 = r6.LLILLL
                        if (r0 == 0) goto L18
                        r0.notifyItemInserted(r1)
                        goto L18
                    L6d:
                        java.util.Iterator r10 = r5.iterator()
                        r9 = 0
                    L72:
                        boolean r0 = r10.hasNext()
                        if (r0 == 0) goto L18
                        java.lang.Object r0 = r10.next()
                        X.0JpL r0 = (X.AbstractC503810JpL) r0
                        long r3 = r0.LIZIZ()
                        long r1 = r7.postId
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 == 0) goto L59
                        int r9 = r9 + 1
                        goto L72
                    L8b:
                        r8 = 0
                        goto L11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C503880JpS.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.07y3
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.sendComment$2");
                    c504090Jpn.invoke(obj);
                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.sendComment$2");
                }
            });
        }
        subSpaceFeedVMKp.wQ2().LIZ(spacePost, "comment");
    }
}
