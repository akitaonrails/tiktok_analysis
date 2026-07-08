package com.ss.android.ugc.aweme.ui.feed.cell;

import X.C01GW;
import X.C04TD;
import X.C0HTT;
import X.C0R6M;
import X.C0RF0;
import X.C0RH4;
import X.C0RH5;
import X.C0RHA;
import X.C0RLL;
import X.C1376010luZ;
import X.C1386360mBG;
import X.C13LE;
import X.C1480420ocy;
import X.C1558420qem;
import X.C19EG;
import X.C2179771ASp;
import X.C2188811AlT;
import X.C343710Ddh;
import X.C452501pT;
import X.C583620Mum;
import X.C673150Qan;
import X.C687700QyG;
import X.C690470R6n;
import X.C696330RTb;
import X.C720310SNh;
import X.C721190SQr;
import X.C729980SkG;
import X.C737030Svd;
import X.C737910Sx3;
import X.EnumC452301pR;
import X.InterfaceC1294060jmO;
import X.InterfaceC689860R4e;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.feed.AdAssemblerServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.IAssemblerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.protocol.PhotoViewCellProtocol;
import com.ss.android.ugc.aweme.protocol.PhotoViewCellScope;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseSimpleFeedViewCell extends VideoViewCell implements C0RH5 {
    public Aweme T0;
    public String U0;
    public final C01GW V0;
    public final C01GW W0;
    public final C01GW X0;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PhotoViewCellScope.class});
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final Object getAbility(Class cls) {
        return super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PhotoViewCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(PhotoViewCellScope.class);
        return arrayList;
    }

    public C0RH4 p1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLFF() {
        C721190SQr.LIZ.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LLFF();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        ((FeedPhotosViewHolder) this).D1(true);
        AssemViewModel assemViewModel = (AssemViewModel) this.X0.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(AFwS243S0000000_11.get$arr$(716));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void LLJJLIIIJLLLLLLLZ() {
        if (this.LLJJIJI != null) {
            return;
        }
        this.LLJJIJI = LJJLIIIJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final Aweme hm() {
        Aweme aweme = this.T0;
        return aweme == null ? this.LLJJ : aweme;
    }

    public final List<PhotoViewCellProtocol> v1() {
        return (List) this.W0.getValue();
    }

    public final C0RH4 x1() {
        return (C0RH4) this.V0.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC583650Mup
    public final void Z1() {
        super.Z1();
        C721190SQr.LIZ.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.Z1();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        C721190SQr.LIZ.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.onDestroyView();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        FeedPhotosViewHolder feedPhotosViewHolder = (FeedPhotosViewHolder) this;
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(feedPhotosViewHolder.getActivity());
        if (iAutoAScrollAbilityLIZIZ != null) {
            iAutoAScrollAbilityLIZIZ.yb0(null);
        }
        feedPhotosViewHolder.B1().LJJIII();
        ((LinkedHashMap) C720310SNh.LJ).clear();
        feedPhotosViewHolder.D1(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    @InterfaceC1294060jmO
    public final void onPause() {
        super.onPause();
        C721190SQr.LIZ.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.onPause();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    @InterfaceC1294060jmO
    public final void onResume() {
        super.onResume();
        fadeInWidgetContainer();
        C721190SQr.LIZ.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.onResume();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public BaseSimpleFeedViewCell(C0RF0 c0rf0) {
        super(c0rf0);
        this.V0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 970));
        this.W0 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 969));
        this.X0 = C737910Sx3.LIZLLL(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(496), EnumC452301pR.SYNCHRONIZED);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        this.T0 = aweme;
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(aweme);
            }
        }
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            InterfaceC689860R4e interfaceC689860R4eLLLLZI = super.LLLLZI(this.c, this.LLLLLLLZIL, this.LLJJIII);
            this.LLLLZ = interfaceC689860R4eLLLLZI;
            interfaceC689860R4eLLLLZI.LLJZ(this.f363e0.param);
            InterfaceC689860R4e interfaceC689860R4e = this.LLLLZ;
            if (interfaceC689860R4e != null) {
                interfaceC689860R4e.LJIIJ(this.LLZL);
            }
            InterfaceC689860R4e interfaceC689860R4e2 = this.LLLLZ;
            if (interfaceC689860R4e2 != null) {
                interfaceC689860R4e2.LLILII(this.LLZLI);
            }
            Fragment fragment = this.LLJJIII;
            if (fragment != null) {
                this.LLJILLL = VideoItemParams.newBuilder(this.f363e0, this.LLLLZ, this, fragment, this.LLZILL, this.LLZL, this, this);
            }
        }
        super.LJI(C729980SkG.LIZLLL(aweme));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        String strCQ2;
        super.LJJIJIIJIL(i);
        C721190SQr.LIZ.getClass();
        C19EG activity = getActivity();
        if (activity != null) {
            strCQ2 = C343710Ddh.LIZ(activity).CQ2();
        } else {
            strCQ2 = null;
        }
        this.U0 = strCQ2;
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LIZ(this.U0);
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(C1558420qem.LIZIZ(this));
            }
        }
        FeedPhotosViewHolder feedPhotosViewHolder = (FeedPhotosViewHolder) this;
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LJIJJ = 0;
        feedPhotosViewHolder.Z0.LLILLJJLI = C2179771ASp.LJIIIIZZ();
        C696330RTb c696330RTb = feedPhotosViewHolder.Z0;
        c696330RTb.LLIZ = 0L;
        c696330RTb.LLIZLLLIL = 0L;
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(feedPhotosViewHolder.getActivity());
        if (iAutoAScrollAbilityLIZIZ != null) {
            iAutoAScrollAbilityLIZIZ.yb0(new AwS590S0100000_11(feedPhotosViewHolder, 534));
        }
        feedPhotosViewHolder.B1().OQ2(feedPhotosViewHolder.getActivity());
        feedPhotosViewHolder.D1(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIL(C0R6M c0r6m) {
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onTabChangeEvent: ");
        sbLIZ.append(c0r6m.LIZ);
        sbLIZ.append(" -> ");
        sbLIZ.append(c0r6m.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LJJIL(c0r6m);
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        if (Intrinsics.LJFF(c0r6m.LIZIZ, "HOME")) {
            s1(true, c0r6m);
        } else {
            s1(false, c0r6m);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIZ(C0RHA c0rha) {
        Boolean boolValueOf;
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onTabSwitchEvent isFeedPage: ");
        if (c0rha != null) {
            boolValueOf = Boolean.valueOf(c0rha.LIZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        if (c0rha != null) {
            C0RH4 c0rh4X1 = x1();
            if (c0rh4X1 != null) {
                c0rh4X1.LJJIZ(c0rha);
            }
            List<PhotoViewCellProtocol> listV1 = v1();
            if (listV1 != null) {
                Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
            y1(c0rha.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(int r7) {
        /*
            r6 = this;
            super.LJLIIIL(r7)
            X.0SQr r2 = X.C721190SQr.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BaseSimpleFeedViewCell onHolderPause, mode: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", userVisibleHint: "
            r1.append(r0)
            boolean r0 = r6.getUserVisibleHint()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.0RH4 r0 = r6.x1()
            if (r0 == 0) goto L2c
            r0.LJJIIJZLJL()
        L2c:
            java.util.List r0 = r6.v1()
            if (r0 == 0) goto L44
            java.util.Iterator r1 = r0.iterator()
        L36:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.next()
            r0.getClass()
            goto L36
        L44:
            r4 = 0
            r0 = 2
            if (r0 != r7) goto Lb6
            X.19EG r0 = r6.getActivity()
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = X.C486860J7k.LIZIZ(r0)
            java.lang.String r0 = "page_profile"
            boolean r5 = r1.FQ2(r0)
        L58:
            java.lang.String r1 = r6.U0
            X.19EG r0 = r6.getActivity()
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C343710Ddh.LIZ(r0)
            java.lang.String r0 = r0.CQ2()
        L68:
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            X.0SQr r2 = X.C721190SQr.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BaseSimpleFeedViewCell isVisibleForUser, isProfilePage: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", fromBottomTabName: "
            r1.append(r0)
            java.lang.String r0 = r6.U0
            r1.append(r0)
            java.lang.String r0 = ", isCurrentBottomTab: "
            r1.append(r0)
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            boolean r0 = r6.getUserVisibleHint()
            if (r0 == 0) goto La2
            if (r5 != 0) goto La2
            if (r3 == 0) goto La2
        L9c:
            r0 = r6
            com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder r0 = (com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder) r0
            r0.D1(r4)
        La2:
            r1 = r6
            com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder r1 = (com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder) r1
            X.0SQr r0 = X.C721190SQr.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r1.B1()
            r0.KQ2()
            return
        Lb2:
            r0 = 0
            goto L68
        Lb4:
            r5 = 0
            goto L58
        Lb6:
            if (r0 == r7) goto La2
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.cell.BaseSimpleFeedViewCell.LJLIIIL(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLJLLIL(boolean z) {
        LLLI(2);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onHolderResume, mode: ");
        sbLIZ.append(2);
        sbLIZ.append(", userVisibleHint: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LLLI(int i) {
        super.LLLI(i);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onHolderResume, mode: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LJJIIZ();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        ((FeedPhotosViewHolder) this).D1(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        C721190SQr.LIZ.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LJJIII();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(z);
            }
        }
        FeedPhotosViewHolder feedPhotosViewHolder = (FeedPhotosViewHolder) this;
        feedPhotosViewHolder.D1(false);
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(feedPhotosViewHolder.getActivity());
        if (iAutoAScrollAbilityLIZIZ != null) {
            iAutoAScrollAbilityLIZIZ.yb0(null);
        }
        feedPhotosViewHolder.B1().LJJIII();
        ((LinkedHashMap) C720310SNh.LJ).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r3, r5) == false) goto L24;
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPausePlay(java.lang.String r5) {
        /*
            r4 = this;
            super.onPausePlay(r5)
            X.0SQr r2 = X.C721190SQr.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BaseSimpleFeedViewCell onPausePlay "
            r1.append(r0)
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.0RH4 r0 = r4.x1()
            if (r0 == 0) goto L20
            r0.LLIIII()
        L20:
            java.util.List r0 = r4.v1()
            if (r0 == 0) goto L38
            java.util.Iterator r1 = r0.iterator()
        L2a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r1.next()
            r0.getClass()
            goto L2a
        L38:
            r2 = r4
            com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder r2 = (com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder) r2
            r3 = 0
            if (r5 == 0) goto L89
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LLJJ
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LLJJ
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddr()
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.getSourceId()
        L5e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L6c
        L64:
            X.0SQr r0 = X.C721190SQr.LIZ
            r0.getClass()
            return
        L6a:
            r0 = r3
            goto L5e
        L6c:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r2.hm()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LLJJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L89
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.hm()
            if (r0 == 0) goto L82
            java.lang.String r3 = r0.getAid()
        L82:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r5)
            if (r0 != 0) goto L89
            goto L64
        L89:
            X.0SQr r0 = X.C721190SQr.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r2.B1()
            r0.KQ2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.cell.BaseSimpleFeedViewCell.onPausePlay(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    @InterfaceC1294060jmO
    public final void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onPlaying ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        super.onRenderFirstFrame(c1480420ocy);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell photomode onRenderFirstFrame sourceId：");
        sbLIZ.append(c1480420ocy.getSourceId());
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LJII();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        ((FeedPhotosViewHolder) this).C1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        super.onResumePlay(str);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onResumePlay ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LJJJJJL();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        ((FeedPhotosViewHolder) this).C1();
    }

    public void y1(boolean z) {
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onPageChanged isFeedPage: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    @InterfaceC1294060jmO
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell onRenderFirstFrame ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        C0RH4 c0rh4X1 = x1();
        if (c0rh4X1 != null) {
            c0rh4X1.LIZIZ();
        }
        List<PhotoViewCellProtocol> listV1 = v1();
        if (listV1 != null) {
            Iterator<PhotoViewCellProtocol> it2 = listV1.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        ((FeedPhotosViewHolder) this).C1();
    }

    public void s1(boolean z, C0R6M c0r6m) {
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSimpleFeedViewCell isHomeTab: ");
        sbLIZ.append(z);
        sbLIZ.append(", onTabChangeEvent: ");
        sbLIZ.append(c0r6m.LIZ);
        sbLIZ.append(" -> ");
        sbLIZ.append(c0r6m.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final InterfaceC689860R4e LLLLZI(View view, C0HTT<C737030Svd> c0htt, Fragment fragment) {
        IAssemblerService iAssemblerService;
        C0RLL c0rllLIZ;
        Object objLIZ = C04TD.LIZ(IAssemblerService.class, false);
        if (objLIZ != null) {
            iAssemblerService = (IAssemblerService) objLIZ;
        } else {
            if (C04TD.LLLFFI == null) {
                synchronized (IAssemblerService.class) {
                    if (C04TD.LLLFFI == null) {
                        C04TD.LLLFFI = new AdAssemblerServiceImpl();
                    }
                }
            }
            iAssemblerService = C04TD.LLLFFI;
        }
        if (iAssemblerService != null) {
            c0rllLIZ = iAssemblerService.LIZ();
        } else {
            c0rllLIZ = null;
        }
        M(c0rllLIZ);
        return new C690470R6n();
    }
}
