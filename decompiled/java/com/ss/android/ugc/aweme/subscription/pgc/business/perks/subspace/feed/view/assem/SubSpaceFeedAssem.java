package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem;

import X.AbstractC1387200mCc;
import X.AbstractC511100K2q;
import X.C019F;
import X.C01GW;
import X.C0HE8;
import X.C0JCK;
import X.C0K2E;
import X.C0K31;
import X.C0K33;
import X.C0K4J;
import X.C0K51;
import X.C0K54;
import X.C0K6D;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1390410mHn;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C457801qK;
import X.C481090Itn;
import X.C511110K2r;
import X.C511370K3r;
import X.C511510K4f;
import X.C520040KaQ;
import X.C521940KdU;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import X.EnumC499440JiI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.ViewTreeObserverOnGlobalLayoutListenerC521810KdH;
import Y.AfS103S0300000_7;
import Y.AfS143S0200000_7;
import Y.AfS172S0100000_3;
import Y.AsS29S0200000_7;
import Y.AsS34S0100000_7;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.bridge.SubscriptionBridgeViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import webcast.api.pgc_sub.PGCCommentSendReq;
import webcast.api.pgc_sub.PGCCommentSendResp;
import webcast.api.pgc_sub.PGCPostCreateReq;
import webcast.api.pgc_sub.PGCPostCreateResp;
import webcast.api.sub.HomePageResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedAssem extends UISlotAssem implements SubSpaceFeedAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJI;
    public C511370K3r LLJJIII;
    public RecyclerView LLJJIJI;
    public C481090Itn LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public boolean LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceFeedAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubSpaceFeedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 834), AFwS237S0000000_7.get$arr$(223), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(182));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 489));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fha;
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

    public final C511370K3r ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C511370K3r.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C511370K3r) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubSpaceFeedVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void KE1() {
        Fragment fragmentLJI;
        C0K54.LIZ().LJ(getContext(), "sslocal://openShoot?enter_from=direct_shoot&tab=live", C2097608Jq.LJ());
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null && ((fragmentLJI = C724240Sb0.LJI(this)) == null || (c19egLIZ = fragmentLJI.getActivity()) == null)) {
            return;
        }
        c19egLIZ.finish();
    }

    public final void LJ() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null && frameLayout.getChildCount() == 0) {
            int i = (int) (36 * context.getResources().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
            C786410Ut5.V6(c1390410mHn, layoutParams);
            c1390410mHn.LIZJ();
            FrameLayout frameLayout2 = this.LLJJIJIL;
            if (frameLayout2 != null) {
                frameLayout2.addView(c1390410mHn, layoutParams);
            }
        }
        FrameLayout frameLayout3 = this.LLJJIJIL;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(0, frameLayout3);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void LJJLI() {
        C0K54.LIZ().LJ(getContext(), "sslocal://webcast_webview?url=https%3A%2F%2Fwww.tiktok.com%2Fcommunity-guidelines&height=484&gravity=bottom&radius=8&type=popup&show_mask=1&mask_bg_color=00000099&use_spark=1", C2097608Jq.LJ());
    }

    public final void hp() {
        String str;
        C11NZ c11nz;
        SubSpaceFeedVM subSpaceFeedVMKp = kp();
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 490);
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 306);
        C511370K3r c511370K3rWQ2 = subSpaceFeedVMKp.wQ2();
        if (c511370K3rWQ2 != null && (str = c511370K3rWQ2.LLILZ) != null && str.length() != 0) {
            C11NZ<DataResponse<HomePageResponse.ResponseData>> spaceHome = C0K4J.LIZ().getSpaceHome(str);
            if (spaceHome == null || (c11nz = (C11NZ) C0JCK.LIZ(spaceHome.LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()), EnumC499440JiI.GENERAL, "SubSpaceFeedVM", "sub/space/homepage", null, 8).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceFeedVMKp))) == null) {
                return;
            }
            c11nz.LJJLL(new AfS143S0200000_7((Object) subSpaceFeedVMKp, (EmoteModel) awS551S0100000_7, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 36), new AfS172S0100000_3((Object) awS586S0100000_7, 65));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterFrom:");
        C511370K3r c511370K3rWQ22 = subSpaceFeedVMKp.wQ2();
        sbLIZ.append(c511370K3rWQ22 != null ? c511370K3rWQ22.LLJIJIL : null);
        sbLIZ.append(" liveRoom:");
        C511370K3r c511370K3rWQ23 = subSpaceFeedVMKp.wQ2();
        sbLIZ.append(c511370K3rWQ23 != null ? Boolean.valueOf(c511370K3rWQ23.LLILZIL) : null);
        sbLIZ.append(" Owner:");
        C511370K3r c511370K3rWQ24 = subSpaceFeedVMKp.wQ2();
        sbLIZ.append(c511370K3rWQ24 != null ? Boolean.valueOf(c511370K3rWQ24.LLJ) : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IllegalStateException illegalStateException = new IllegalStateException(strLIZIZ);
        C0K6D.LIZJ(illegalStateException, strLIZIZ, C2097608Jq.LJ());
        awS586S0100000_7.invoke(illegalStateException);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        C1558520qew.LJII(c19egLIZ != null ? C1558360qeg.LJI(c19egLIZ, null) : C1558520qew.LJIIL(this), this, SubSpaceFeedAbility.class, null, this);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        Context contextLJIIJ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if ((fragmentLJI != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIJ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) || (contextLJIIJ = C0K51.LJIIJ(context, false)) != null) {
            context = contextLJIIJ;
        }
        return C0HE8.LIZ(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gh(long r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM r5 = r9.kp()
            X.0K2r r7 = r5.LLILZIL
            if (r7 == 0) goto L8e
            X.0K2Z r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            java.util.ArrayList<X.0K2w> r8 = r0.LL
            if (r8 == 0) goto L8e
            java.util.Iterator r4 = r8.iterator()
            r3 = 0
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r4.next()
            X.0K2w r0 = (X.AbstractC511160K2w) r0
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
            X.0K2Z r0 = r7.LLILLL
            if (r0 == 0) goto L3b
            r0.notifyItemRemoved(r3)
        L3b:
            java.util.Iterator r4 = r8.iterator()
            r3 = 0
        L40:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r4.next()
            X.0K2w r0 = (X.AbstractC511160K2w) r0
            long r1 = r0.LIZIZ()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L2f
            int r3 = r3 + 1
            goto L40
        L57:
            X.0K2Z r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            java.util.ArrayList<X.0K2w> r4 = r0.LL
            if (r4 == 0) goto L8e
            r1 = 0
            if (r6 < 0) goto La5
            int r0 = r4.size()
            if (r0 <= r6) goto La5
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r6)
            boolean r0 = r3 instanceof X.C0K2M
            if (r0 == 0) goto La5
        L70:
            int r2 = r6 + 1
            if (r2 < 0) goto L98
            int r0 = r4.size()
            if (r0 <= r2) goto L98
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            boolean r0 = r1 instanceof X.C0K2M
            if (r0 == 0) goto L98
            if (r1 == 0) goto L98
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r2)
            X.0K2Z r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            r0.notifyItemRemoved(r2)
        L8e:
            r0 = 317(0x13d, float:4.44E-43)
            kotlin.jvm.internal.AFwS237S0000000_7 r0 = kotlin.jvm.internal.AFwS237S0000000_7.get$arr$(r0)
            r5.setState(r0)
            return
        L98:
            if (r3 == 0) goto L8e
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r6)
            X.0K2Z r0 = r7.LLILLL
            if (r0 == 0) goto L8e
            r0.notifyItemRemoved(r6)
            goto L8e
        La5:
            r3 = r1
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem.Gh(long):void");
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void e(PGCPostCreateReq pGCPostCreateReq) {
        C11NZ c11nz;
        LJ();
        SubSpaceFeedVM subSpaceFeedVMKp = kp();
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 493);
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 308);
        C11NZ<DataResponse<PGCPostCreateResp.ResponseData>> c11nzE = C0K4J.LIZ().e(pGCPostCreateReq);
        if (c11nzE != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzE, EnumC499440JiI.GENERAL, "SubSpaceFeedVM", "sub/space/post/create", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceFeedVMKp))) != null) {
            c11nz.LJJLL(new AfS103S0300000_7(pGCPostCreateReq, subSpaceFeedVMKp, awS551S0100000_7, 24), new AfS172S0100000_3((Object) awS586S0100000_7, 68));
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void jn(SpacePost spacePost) {
        SubSpaceFeedVM subSpaceFeedVMKp = kp();
        if (spacePost != null) {
            subSpaceFeedVMKp.setState(new AwS586S0100000_7(spacePost, 489));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0K2Z, X.19ry] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        C511110K2r c511110K2r;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Jtr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILLL;
            }
        }, null, new AwS621S0100000_7(this, 96), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Jtt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLIZLLLIL;
            }
        }, null, AFwS290S0000000_7.get$arr$(22), 6);
        this.LLJJIJIL = (FrameLayout) view.findViewById(R.id.nlo);
        ((C511510K4f) this.LLJJJIL.getValue()).LIZIZ(view, new AwS551S0100000_7(this, 491));
        C723850SaN.LIZLLL(this, new AwS586S0100000_7(this, 445));
        if (!kp().AQ2()) {
            C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 511));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hui);
        this.LLJJIJI = recyclerView;
        if (recyclerView != 0 && (c511110K2r = kp().LLILZIL) != null) {
            final ArrayList arrayList = new ArrayList();
            final SubSpaceFeedVM subSpaceFeedVM = c511110K2r.LL;
            final C511370K3r c511370K3r = c511110K2r.LLILLJJLI;
            ?? r3 = new AbstractC511100K2q(arrayList, subSpaceFeedVM, c511370K3r) { // from class: X.0K2Z
                public final SubSpaceFeedVM LLILLJJLI;
                public final C511370K3r LLILLL;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    return ((AbstractC511160K2w) ListProtector.get(this.LL, i)).LIZJ().getValue();
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C0K3V c0k3v;
                    if ((viewHolder instanceof C0K3V) && (c0k3v = (C0K3V) viewHolder) != null) {
                        c0k3v.I5((AbstractC511160K2w) ListProtector.get(this.LL, i), this.LLILLL);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder c0k3v;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i == C0K2L.HEADER.getValue()) {
                        c0k3v = new C0K2V(C786410Ut5.Td(layoutInflaterNe, R.layout.fhu, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.SUB_ONLY_VIDEO.getValue()) {
                        c0k3v = new C0K2G(C786410Ut5.Td(layoutInflaterNe, R.layout.fhz, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.TEXT.getValue()) {
                        c0k3v = new C510960K2c(C786410Ut5.Td(layoutInflaterNe, R.layout.fi0, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.COMMENT.getValue()) {
                        c0k3v = new C511080K2o(C786410Ut5.Td(layoutInflaterNe, R.layout.fhq, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POLL.getValue()) {
                        c0k3v = new C510970K2d(C786410Ut5.Td(layoutInflaterNe, R.layout.fhx, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POLL_ITEM.getValue()) {
                        c0k3v = new C0K35(C786410Ut5.Td(layoutInflaterNe, R.layout.fhy, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.POST_BTM_ACTION.getValue()) {
                        c0k3v = new C511340K3o(C786410Ut5.Td(layoutInflaterNe, R.layout.fho, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.DIVIDER.getValue()) {
                        c0k3v = new C0K2P(C786410Ut5.Td(layoutInflaterNe, R.layout.fhs, viewGroup, false));
                    } else if (i == C0K2L.LOAD_MORE.getValue()) {
                        c0k3v = new C510980K2e(C786410Ut5.Td(layoutInflaterNe, R.layout.fhw, viewGroup, false));
                    } else if (i == C0K2L.EMPTY.getValue()) {
                        c0k3v = new C0K2Y(C786410Ut5.Td(layoutInflaterNe, R.layout.fht, viewGroup, false), this.LLILLJJLI);
                    } else if (i == C0K2L.BLOCK_CONTENT_ITEM.getValue()) {
                        c0k3v = new C510950K2b(C786410Ut5.Td(layoutInflaterNe, R.layout.fhn, viewGroup, false));
                    } else if (i == C0K2L.MOCK_TIP_TEXT.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.fi2, viewGroup, false);
                        c0k3v = new C0K3V(viewTd) { // from class: X.0K2f
                            public final View LL;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                            }

                            @Override // X.C0K3V
                            public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
                                View viewFindViewById = this.LL.findViewById(R.id.kmd);
                                if (viewFindViewById != null) {
                                    viewFindViewById.setBackground(C510570K0p.LIZ((int) C511520K4g.LIZ(8.0f), C426930God.LIZ(R.attr.f_w, this.LL.getContext()), 0, (int) C511520K4g.LIZ(0.0f)));
                                }
                                TextView textView = (TextView) this.LL.findViewById(R.id.xyu);
                                if (textView != null) {
                                    textView.setText(C511520K4g.LJII(2131849266));
                                }
                            }
                        };
                    } else if (i == C0K2L.SPACE_ACTIVITY_INDICATOR.getValue()) {
                        c0k3v = new C0K2F(C786410Ut5.Td(layoutInflaterNe, R.layout.fh1, viewGroup, false));
                    } else {
                        c0k3v = new C0K3V(new FrameLayout(viewGroup.getContext()));
                    }
                    try {
                        View view2 = c0k3v.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c0k3v.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c0k3v.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(c0k3v.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c0k3v.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c0k3v.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = c0k3v.getClass().getName();
                    return c0k3v;
                }

                {
                    this.LLILLJJLI = subSpaceFeedVM;
                    this.LLILLL = c511370K3r;
                }
            };
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(r3);
            c511110K2r.LLILLL = r3;
            ((C0K31) c511110K2r.LLILZ.getValue()).LIZ(recyclerView);
            recyclerView.addOnScrollListener(new AsS29S0200000_7(linearLayoutManager, c511110K2r, 2));
            C0K2E c0k2e = (C0K2E) c511110K2r.LLILZLL.getValue();
            c0k2e.getClass();
            recyclerView.addOnScrollListener(new AsS34S0100000_7(c0k2e, 13));
            C786410Ut5.x3(recyclerView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(recyclerView, c0k2e, 6));
        }
        LJ();
        hp();
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Juh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 97), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0Ju0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILZ;
            }
        }, null, new AwS621S0100000_7(this, 98), 6);
        this.LLJJIJIIJIL = (C481090Itn) view.findViewById(R.id.wsc);
        C511370K3r c511370K3rIp = ip();
        if (c511370K3rIp != null && C0K51.LJI(Boolean.valueOf(c511370K3rIp.LLJJIJI))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
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
                c481090Itn6.setOnRefreshListener(new AwS551S0100000_7(this, 709));
            }
        }
        C457801qK.LIZ(new C521940KdU(((SubscriptionBridgeViewModel) this.LLJJJJ.getValue()).LL, 6), this, new C0K33(this, null));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility
    public final void hE1(PGCCommentSendReq pGCCommentSendReq, SpacePost spacePost) {
        C11NZ c11nz;
        LJ();
        SubSpaceFeedVM subSpaceFeedVMKp = kp();
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 492);
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 307);
        C11NZ<DataResponse<PGCCommentSendResp.ResponseData>> c11nzN1 = C0K4J.LIZ().n1(pGCCommentSendReq);
        if (c11nzN1 != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzN1.LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()), EnumC499440JiI.GENERAL, "SubSpaceFeedVM", "sub/space/comment/send", null, 8).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceFeedVMKp))) != null) {
            c11nz.LJJLL(new AfS103S0300000_7(awS551S0100000_7, subSpaceFeedVMKp, spacePost, 23), new AfS172S0100000_3((Object) awS586S0100000_7, 67));
        }
        subSpaceFeedVMKp.xQ2().LIZ(spacePost, "comment");
    }
}
