package com.ss.android.ugc.aweme.comment.likelist.adapter;

import X.AbstractC1386130mAt;
import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0IB7;
import X.C0NYY;
import X.C0O26;
import X.C0SY7;
import X.C0ZD9;
import X.C0ZDI;
import X.C0ZE7;
import X.C1260910iuv;
import X.C1264070j01;
import X.C1264800j1C;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1336205Ku;
import X.C1341780l1M;
import X.C1342220l24;
import X.C1351950lHl;
import X.C1356860lPg;
import X.C1357110lQ5;
import X.C1387050mCN;
import X.C13LE;
import X.C1402380mb6;
import X.C1609500rzA;
import X.C19651011uW;
import X.C19719912Dl;
import X.C19727912Gn;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C297570BlT;
import X.C419910GdJ;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C520040KaQ;
import X.C560910LzF;
import X.C595660NXw;
import X.C595710NYb;
import X.C724240Sb0;
import X.C735840Sti;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C894700Z8a;
import X.C896480ZEw;
import X.C897370ZIh;
import X.C897490ZIt;
import X.C897520ZIw;
import X.C946803n0;
import X.EnumC1260930iux;
import X.EnumC1341650l19;
import X.EnumC1387060mCO;
import X.EnumC1910440zoY;
import X.EnumC896030ZDd;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC897380ZIi;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.comment.util.ActivityStatusLifecycleOwnerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
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
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeCell extends PowerCell<C1356860lPg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 189));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 164));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 175));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 162));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 166));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 172));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 170));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 187));
    public final AssemVMLazy LLJ;
    public String LLJI;
    public User LLJIJIL;
    public boolean LLJILJIL;
    public C894700Z8a LLJILJILJ;
    public final C01GW LLJILLL;
    public final String LLJJ;
    public final C01GW LLJJI;
    public final AObserverS224S0100000_21 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LikeCell.class, "_activityStatusLifecycleOwnerVM", "get_activityStatusLifecycleOwnerVM()Lcom/ss/android/ugc/aweme/comment/util/ActivityStatusLifecycleOwnerVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LikeCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActivityStatusLifecycleOwnerVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 193);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(77);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 173), awS565S0100000_21, AFwS209S0000000_21.get$arr$(123), new AwS565S0100000_21((C03K6) this, 176), new AwS565S0100000_21((C03K6) this, 178), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 180), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 182), null, new AwS565S0100000_21((C03K6) this, 183));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 177);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 179);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 181);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 9));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 184);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 186);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 188);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 190);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 191);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 192), awS565S0100000_21, AFwS209S0000000_21.get$arr$(124), new AwS565S0100000_21((C03K6) this, 194), new AwS565S0100000_21((C03K6) this, 195), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 196), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 160), null, new AwS565S0100000_21((C03K6) this, 161));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 163), awS565S0100000_21, AFwS209S0000000_21.get$arr$(122), new AwS565S0100000_21((C03K6) this, 165), new AwS565S0100000_21((C03K6) this, 168), new AwS565S0100000_21((C03K6) this, 169), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 171));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = "";
        this.LLJILJILJ = C894700Z8a.LJI;
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 174));
        this.LLJJ = "video_like_list";
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 185));
        this.LLJJIII = new AObserverS224S0100000_21(this, 21);
    }

    public final LikeListVM S5() {
        return (LikeListVM) this.LL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5() {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell.N5():void");
    }

    public final ActivityStatusLifecycleOwnerVM P5() {
        Fragment fragmentLJI;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner == null || (fragmentLJI = C724240Sb0.LJI(currentLifecycleOwner)) == null || !fragmentLJI.isAdded()) {
            return null;
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (ActivityStatusLifecycleOwnerVM) assemVMLazy.getValue();
    }

    public final ILightInteractionPlatformService R5() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    public final void W5() {
        User user;
        C1356860lPg item = getItem();
        if (item == null || (user = item.LL) == null || ((Set) S5().LLJ.getValue()).contains(user.getUid()) || !V5(EnumC1260930iux.SHOW)) {
            return;
        }
        ((Set) S5().LLJ.getValue()).add(user.getUid());
    }

    public final void b6() {
        User user;
        if (C560910LzF.LIZ()) {
            ActivityStatusLifecycleOwnerVM activityStatusLifecycleOwnerVMP5 = P5();
            String uid = null;
            C0ZE7 c0ze7 = new C0ZE7(activityStatusLifecycleOwnerVMP5 != null ? activityStatusLifecycleOwnerVMP5.LL : null);
            c0ze7.LIZIZ(EnumC1910440zoY.LIKE_LIST);
            c0ze7.LJII = Boolean.valueOf(this.LLJILJIL);
            C1356860lPg item = getItem();
            if (item != null && (user = item.LL) != null) {
                uid = user.getUid();
            }
            c0ze7.LIZJ = uid;
            C897490ZIt.LIZLLL(c0ze7);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C1402380mb6(this, 0));
        C897520ZIw c897520ZIwVQ2 = S5().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LIZIZ(true, new C0NYY() { // from class: X.0lQb
                @Override // X.C0NYY
                public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    C595660NXw c595660NXw;
                    C1356860lPg item = this.LL.getItem();
                    if (item != null && (c595660NXw = map.get(item.LL.getUid())) != null) {
                        this.LL.LLJILJIL = C896480ZEw.LIZJ(c595660NXw);
                        LikeCell likeCell = this.LL;
                        likeCell.LLJILJILJ = C896480ZEw.LIZ(c595660NXw, likeCell.itemView.getContext(), 2);
                        LikeCell likeCell2 = this.LL;
                        likeCell2.X5(likeCell2.LLJILJIL);
                        C1356860lPg item2 = this.LL.getItem();
                        if (item2 != null) {
                            this.LL.L5(item2);
                        }
                        if (Intrinsics.LJFF(this.LL.S5().zQ2().getValue(), true)) {
                            this.LL.b6();
                        }
                        return Unit.LIZ;
                    }
                    return Unit.LIZ;
                }
            });
        }
        ((C1609500rzA) this.LLILLL.getValue()).setRingStrokeWidthByAvatarSize(48);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        LifecycleOwner lifecycleOwnerLJFF;
        boolean zLJI = MethodIDManager.LJI(202321);
        super.onViewAttachedToWindow();
        AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(this.itemView);
        if (abstractC1387200mCcLIZ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZ.LJFF()) != null) {
            S5().zQ2().observe(lifecycleOwnerLJFF, this.LLJJIII);
        }
        if (Intrinsics.LJFF(S5().zQ2().getValue(), Boolean.TRUE)) {
            W5();
            b6();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        S5().zQ2().removeObserver(this.LLJJIII);
    }

    public final void I5(C1356860lPg c1356860lPg) {
        RelationButton relationButton = (RelationButton) this.LLIZ.getValue();
        User user = this.LLJIJIL;
        if (user != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LJIIJJI = C946803n0.LIZ(this.itemView);
            c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_AFTER_NUDGE;
            c1387050mCN.LJIIJ = T5(this.LLJIJIL);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
        }
        relationButton.setTracker(new AwS422S0200000_21(this, c1356860lPg, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(X.C1356860lPg r26) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell.L5(X.0lPg):void");
    }

    public final boolean T5(User user) {
        MatchedFriendStruct matchedFriendStruct;
        String str;
        List<MutualUser> list = null;
        if (user != null) {
            matchedFriendStruct = user.getMatchedFriendStruct();
        } else {
            matchedFriendStruct = null;
        }
        if (matchedFriendStruct != null) {
            MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
            if (mutualStruct != null) {
                list = mutualStruct.userList;
            }
            if ((list != null && !list.isEmpty()) || ((str = matchedFriendStruct.recommendReason) != null && str.length() != 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean V5(EnumC1260930iux enumC1260930iux) {
        C1356860lPg item = getItem();
        if (item == null || !T5(item.LL)) {
            return false;
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(item.LLILLJJLI.LIZJ);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        String str = item.LLILLJJLI.LIZ;
        if (str == null) {
            str = "";
        }
        c1260910iuv.LJJLIIIJLLLLLLLZ = str;
        c1260910iuv.LJJJJZI(item.LL);
        c1260910iuv.LJJLIIIJILLIZJL = C1264800j1C.LIZJ();
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJJJIZL("like_list");
        Object objLJIIIZ = c19651011uW.LJIIIZ(item.LLILLJJLI.LIZIZ, c1260910iuv);
        Aweme aweme = item.LLILLJJLI.LIZIZ;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
        return true;
    }

    public final void X5(boolean z) {
        if (z) {
            ((C19727912Gn) this.LLILZ.getValue()).setActive(true);
            C786410Ut5.d0((C19727912Gn) this.LLILZ.getValue(), 0);
        } else {
            C786410Ut5.d0((C19727912Gn) this.LLILZ.getValue(), 8);
        }
    }

    public final void a6(String str) {
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner;
        String str2;
        User user;
        String uid;
        C1357110lQ5 c1357110lQ5;
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
        C1356860lPg item = getItem();
        String str3 = "";
        if (item == null || (c1357110lQ5 = item.LLILLJJLI) == null || (str2 = c1357110lQ5.LIZJ) == null) {
            str2 = "";
        }
        c0ze7.LIZLLL = str2;
        c0ze7.LJII = Boolean.valueOf(this.LLJILJIL);
        c0ze7.LIZIZ(EnumC1910440zoY.LIKE_LIST);
        c0ze7.LJFF = str;
        C1356860lPg item2 = getItem();
        if (item2 != null && (user = item2.LL) != null && (uid = user.getUid()) != null) {
            str3 = uid;
        }
        c0ze7.LIZJ = str3;
        C897490ZIt.LIZIZ(c0ze7);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        UrlModel avatarThumb;
        User user;
        MatchedFriendStruct matchedFriendStruct;
        List<String> list;
        String strValueOf;
        User user2;
        C1356860lPg c1356860lPg = (C1356860lPg) interfaceC1891350zJl;
        super.onBindItemView(c1356860lPg);
        User user3 = c1356860lPg.LL;
        this.LLJIJIL = user3;
        this.LLJI = c1356860lPg.LLILLJJLI.LIZJ;
        String strLJ = null;
        if (user3 != null) {
            avatarThumb = user3.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ.LIZ(this.itemView.getContext()));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ2.LIZ(this.itemView.getContext()));
        c1331670kl3LJIIIIZZ.LIZLLL("LikeCell");
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLILLJJLI.getValue());
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        C786410Ut5.G9((SmartAvatarImageView) this.LLILLJJLI.getValue(), new ACListenerS155S0100000_21(this, 1));
        C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS259S0000000_21.get$arr$(14), c1356860lPg);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ);
        this.LLJILJIL = C896480ZEw.LIZJ(c595660NXwLIZIZ);
        this.LLJILJILJ = C896480ZEw.LIZ(c595660NXwLIZIZ, this.itemView.getContext(), 2);
        X5(this.LLJILJIL);
        InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJILLL.getValue();
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LIZLLL(this.LLJIJIL);
        }
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 2), this.itemView);
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, this.itemView, EnumC1341650l19.CELL, 0.0f, null, 12);
        User user4 = this.LLJIJIL;
        if (user4 != null) {
            strLJ = user4.getUserDisplayName();
        }
        if (strLJ == null || strLJ.length() == 0) {
            strLJ = C1342220l24.LJ(this.LLJIJIL, c1356860lPg.LLILLJJLI.LIZJ, true, true);
            User user5 = this.LLJIJIL;
            if (user5 != null) {
                user5.setUserDisplayName(strLJ);
            }
        }
        ((TextView) this.LLILZIL.getValue()).setText(strLJ);
        C786410Ut5.v0((RelationLabelTextView) this.LLILZLL.getValue(), 8);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLIZLLLIL.getValue(), 8);
        if (((C297570BlT.LIZIZ() && (user2 = this.LLJIJIL) != null && user2.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue()) || (C297570BlT.LIZ() == 1 && (user = this.LLJIJIL) != null && user.getFollowStatus() == C0SY7.FOLLOWED.getValue())) && (list = c1356860lPg.LLILZLL) != null && !list.isEmpty()) {
            if (c1356860lPg.LLILZLL.size() > 10) {
                strValueOf = "10+";
            } else {
                strValueOf = String.valueOf(c1356860lPg.LLILZLL.size());
            }
            ((TextView) this.LLIZLLLIL.getValue()).setText(this.itemView.getContext().getResources().getQuantityString(2131756054, c1356860lPg.LLILZLL.size(), strValueOf));
            C786410Ut5.LLLLZLL((TuxTextView) this.LLIZLLLIL.getValue(), 0);
        } else {
            User user6 = this.LLJIJIL;
            if (user6 != null && (matchedFriendStruct = user6.getMatchedFriendStruct()) != null) {
                C786410Ut5.v0((RelationLabelTextView) this.LLILZLL.getValue(), 0);
                RelationLabelTextView.LJJJJL((RelationLabelTextView) this.LLILZLL.getValue(), matchedFriendStruct, C1264070j01.LJIIJJI);
            } else {
                C786410Ut5.v0((RelationLabelTextView) this.LLILZLL.getValue(), 8);
            }
        }
        ((TextView) this.LLILZLL.getValue()).setTextColor(C1351950lHl.LJ(R.attr.a1k, R.color.di, this.itemView.getContext()));
        C1356860lPg item = getItem();
        if (item != null) {
            C1356860lPg c1356860lPg2 = item;
            L5(c1356860lPg2);
            if (c1356860lPg2.LLILLL) {
                HandlerHook.viewPostDelay(this.itemView, new ARunnableS121S0100000_21(this, 4), 150L);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a38, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        if (Intrinsics.LJFF(S5().zQ2().getValue(), Boolean.TRUE)) {
            b6();
        }
    }

    public final void U5(C1356860lPg c1356860lPg, RelationButton relationButton) {
        String uid;
        IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
        C0IB7 c0ib7 = C0IB7.LIKE;
        User user = this.LLJIJIL;
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
            c1387050mCN.LJIIJ = T5(this.LLJIJIL);
            C0ZDI c0zdi = C0ZDI.RELATION_BUTTON_COMBINE;
            BaseContent.ReferenceVideo referenceVideoLIZLLL = imNudgeAndStreakService.LIZLLL(c1356860lPg.LLILLJJLI.LIZIZ);
            AttachmentComponent attachmentComponentLIZJ = imNudgeAndStreakService.LIZJ(c1356860lPg.LLILLJJLI.LIZIZ, this.LLJIJIL, c0ib7);
            EnumC896030ZDd enumC896030ZDd = EnumC896030ZDd.VIDEO_LIKE_LIST;
            User user2 = this.LLJIJIL;
            if (user2 == null || (uid = user2.getUid()) == null) {
                uid = "";
            }
            c1387050mCN.LJIILL = new C0ZD9(c0zdi, enumC896030ZDd, true, c0ib7, referenceVideoLIZLLL, uid, attachmentComponentLIZJ, null, 128);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
        }
    }
}
