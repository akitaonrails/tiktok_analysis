package com.ss.android.ugc.aweme.feed.collection.friends.component;

import X.C01GW;
import X.C0SUC;
import X.C10IT;
import X.C13LE;
import X.C1558520qew;
import X.C1588330rR1;
import X.C1599640rjG;
import X.C1888107aR;
import X.C19EG;
import X.C2217381BqS;
import X.C296380BjY;
import X.C337180DJs;
import X.C452501pT;
import X.C582980Mtk;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C710930Rud;
import X.C719620SKq;
import X.C720360SNm;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729510SjV;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC20561815d2;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC719460SKa;
import X.InterfaceC719640SKs;
import X.SharedElementCallbackC719580SKm;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS111S0100000_11;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ability.IPhotoNumIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailMaskAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.component.FriendsDetailTransitionAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailTransitionAssem extends BaseCellSlotComponent<FriendsDetailTransitionAssem> implements FriendsDetailTransitionAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public boolean LLLI;
    public boolean LLLII;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 322));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 84));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 320));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 321));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 317));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS555S0100000_11(this, 316));
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS555S0100000_11(this, 318));
    public final C630740Ooa LLLFFI = C628500Oky.LIZ(new AwS555S0100000_11(this, 319));
    public final C01GW LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(117));
    public final SharedElementCallbackC719580SKm LLLIIII = new SharedElementCallback() { // from class: X.0SKm
        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            list.clear();
            map.clear();
            String transitionName = this.LIZ.Ip().getTransitionName();
            if (transitionName != null) {
                FriendsDetailTransitionAssem friendsDetailTransitionAssem = this.LIZ;
                list.add(transitionName);
                map.put(transitionName, friendsDetailTransitionAssem.Ip());
            }
        }
    };

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bab;
    }

    public final void Xp() {
        Window window;
        Transition sharedElementEnterTransition;
        if (xN(false) || this.LLLII) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        IFriendsDetailPageAbility iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFriendsDetailPageAbility.class, null);
        if (iFriendsDetailPageAbility != null && iFriendsDetailPageAbility.AP()) {
            Ip().setTransitionName(C1888107aR.LIZIZ(null, aid));
            this.LLLII = true;
            return;
        }
        View viewLr = C1599640rjG.LIZIZ.Lr();
        Wp();
        View viewEp = Ep();
        if (viewEp != null) {
            C337180DJs.LIZIZ(viewEp);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (sharedElementEnterTransition = window.getSharedElementEnterTransition()) == null) {
            HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS106S0100000_6(this, 200), 300L);
        } else {
            sharedElementEnterTransition.addListener(new Transition.TransitionListener() { // from class: X.0SKo
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    View viewEp2 = this.LIZ.Ep();
                    if (viewEp2 != null) {
                        C337180DJs.LIZJ(viewEp2);
                    }
                }
            });
        }
        aq(true);
        HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS111S0100000_11(this, 120), 250L);
        C719620SKq.LIZ(viewLr, 0.5f, new AwS590S0100000_11(this, 118));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -155505264) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility
    public final void xG1() {
        Integer numValueOf;
        Integer numValueOf2;
        if (xN(false)) {
            return;
        }
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJZ.getValue();
        int iXt0 = iPhotoSlidesAbility != null ? iPhotoSlidesAbility.xt0() : 0;
        Vp(Fp());
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(Bp(), iXt0, false);
        if (photoModeImageLJIILIIL != null) {
            numValueOf = Integer.valueOf(photoModeImageLJIILIIL.width);
            numValueOf2 = Integer.valueOf(photoModeImageLJIILIIL.height);
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        Up(numValueOf, numValueOf2);
        if (this.LLLII) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        IFriendsDetailPageAbility iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFriendsDetailPageAbility.class, null);
        if (iFriendsDetailPageAbility != null && iFriendsDetailPageAbility.AP()) {
            View viewFp = Fp();
            if (viewFp != null) {
                viewFp.setTransitionName(C1888107aR.LIZIZ(Integer.valueOf(iXt0), aid));
            }
            Ip().setTransitionName(C1888107aR.LIZIZ(Integer.valueOf(iXt0), aid));
            this.LLLII = true;
            return;
        }
        Wp();
        aq(true);
        HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS111S0100000_11(this, 120), 250L);
        View viewFp2 = Fp();
        if (viewFp2 != null) {
            viewFp2.setTransitionName(C1888107aR.LIZIZ(Integer.valueOf(iXt0), aid));
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            c19egLIZ.startPostponedEnterTransition();
        }
        this.LLLII = true;
    }

    public final Aweme Bp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
    }

    public final View Ep() {
        IViewPagerAbility iViewPagerAbility;
        View view;
        InterfaceC719640SKs interfaceC719640SKs;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLL.getValue();
        if ((!(iVideoCellAbility instanceof InterfaceC719640SKs) || (interfaceC719640SKs = (InterfaceC719640SKs) iVideoCellAbility) == null || (view = interfaceC719640SKs.LJJIJL()) == null) && ((iViewPagerAbility = (IViewPagerAbility) C1558520qew.LIZ(this, IViewPagerComponentAbility.class, null)) == null || (view = iViewPagerAbility.getView()) == null)) {
            return null;
        }
        return view.findViewById(R.id.kvf);
    }

    public final View Fp() {
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJZ.getValue();
        if (iPhotoSlidesAbility == null || (interfaceC719460SKaLJLIL = iPhotoSlidesAbility.LJLIL()) == null) {
            return null;
        }
        return interfaceC719460SKaLJLIL.getImageView();
    }

    public final View Gp() {
        return (View) this.LLJLLIL.getValue();
    }

    public final ImageView Ip() {
        return (ImageView) this.LLJLLL.getValue();
    }

    public final View LLLLLLLZIL() {
        InterfaceC583650Mup interfaceC583650MupX3;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLL.getValue();
        if (iVideoCellAbility == null || (interfaceC583650MupX3 = iVideoCellAbility.x3()) == null) {
            return null;
        }
        return interfaceC583650MupX3.getVideoView();
    }

    public final void Jp() {
        FriendsDetailMaskAbility friendsDetailMaskAbility;
        VideoMaskInfo contentClassificationMaskInfo;
        Aweme awemeBp = Bp();
        if (awemeBp != null) {
            C10IT.LIZ.getClass();
            if ((C10IT.LJIILJJIL(awemeBp) || C10IT.LJIIL(awemeBp) || C10IT.LJIILIIL(awemeBp) || ((contentClassificationMaskInfo = awemeBp.getContentClassificationMaskInfo()) != null && Intrinsics.LJFF(contentClassificationMaskInfo.showMask, Boolean.TRUE))) && (friendsDetailMaskAbility = (FriendsDetailMaskAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FriendsDetailMaskAbility.class, null)) != null) {
                friendsDetailMaskAbility.Er();
            }
        }
    }

    public final void Qp() {
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        View viewLJI;
        if (!C582980Mtk.LIZIZ(Bp()) && !C710930Rud.LJII(Bp()) && !C729510SjV.LJJIIZI(Bp())) {
            View viewLLLLLLLZIL = LLLLLLLZIL();
            if (viewLLLLLLLZIL != null) {
                C337180DJs.LIZ(viewLLLLLLLZIL);
                return;
            }
            return;
        }
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJZ.getValue();
        if (iPhotoSlidesAbility == null || (interfaceC719460SKaLJLIL = iPhotoSlidesAbility.LJLIL()) == null || (viewLJI = interfaceC719460SKaLJLIL.LJI()) == null) {
            return;
        }
        C337180DJs.LIZ(viewLJI);
    }

    public final void Wp() {
        Window window;
        Transition sharedElementEnterTransition;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (sharedElementEnterTransition = window.getSharedElementEnterTransition()) == null) {
            HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS111S0100000_11(this, 31), 300L);
        } else {
            sharedElementEnterTransition.addListener(new Transition.TransitionListener() { // from class: X.0SKl
                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    C1599640rjG.LIZIZ.Du();
                    FriendsDetailTransitionAssem friendsDetailTransitionAssem = this.LIZ;
                    friendsDetailTransitionAssem.getClass();
                    IFriendsDetailPageAbility iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(friendsDetailTransitionAssem), IFriendsDetailPageAbility.class, null);
                    if (iFriendsDetailPageAbility != null) {
                        iFriendsDetailPageAbility.Cy1();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility
    public final void kX() {
        Ip().setImageBitmap(null);
        this.LLLI = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility
    public final void Dd0(AwS568S0100000_24 awS568S0100000_24) {
        AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11(this, awS568S0100000_24, 23);
        if (C296380BjY.LIZ()) {
            C1599640rjG.LIZIZ.gv(new AwS555S0100000_11(awS412S0200000_11, 1388));
        } else {
            awS412S0200000_11.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility
    public final void HM(AwS568S0100000_24 awS568S0100000_24) {
        Jp();
        Gp().setBackground(null);
        C337180DJs.LIZJ(Gp());
        zw0(new AwS412S0200000_11(this, awS568S0100000_24, 64));
    }

    public final void Vp(View view) {
        if (view == null) {
            return;
        }
        int height = view.getHeight();
        float translationY = view.getTranslationY();
        if (height > 0) {
            Tp(-1, height, Gp());
        }
        if (translationY > 0.0f) {
            C786410Ut5.ed(Gp(), translationY);
        }
    }

    public final void aq(boolean z) {
        IFeedCleanAbility iFeedCleanAbility = (IFeedCleanAbility) this.LLLFFI.getValue();
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.Xk(null, "friends_trans", z, true, true, false);
        }
        ICellCleanAbility iCellCleanAbility = (ICellCleanAbility) this.LLLFF.getValue();
        if (iCellCleanAbility != null) {
            iCellCleanAbility.Xk(null, "friends_trans", z, false, false, true);
        }
        if (z) {
            IPhotoNumIndicatorAbility iPhotoNumIndicatorAbility = (IPhotoNumIndicatorAbility) this.LLJZIJLIL.getValue();
            if (iPhotoNumIndicatorAbility != null) {
                iPhotoNumIndicatorAbility.Mx0();
                return;
            }
            return;
        }
        IPhotoNumIndicatorAbility iPhotoNumIndicatorAbility2 = (IPhotoNumIndicatorAbility) this.LLJZIJLIL.getValue();
        if (iPhotoNumIndicatorAbility2 == null) {
            return;
        }
        iPhotoNumIndicatorAbility2.Rm1();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        Object obj2;
        super.onViewCreated(view);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!C582980Mtk.LIZIZ(((VideoItemParams) obj).getAweme())) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (!C710930Rud.LJII(((VideoItemParams) obj2).getAweme())) {
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj3 = c724270Sb33.LL;
                }
                if (!C729510SjV.LJJIIZI(((VideoItemParams) obj3).getAweme())) {
                    C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0SEb
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj4) {
                            return ((C709790Rsn) obj4).LLJJJJLIIL;
                        }
                    }, null, AFwS294S0000000_11.get$arr$(245), 6);
                    CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLLF.getValue();
                    if (cellAdaptionComponentAbility != null) {
                        cellAdaptionComponentAbility.aW0(new InterfaceC20561815d2<VideoAdaptionResult>() { // from class: X.0SKk
                            @Override // X.InterfaceC20561815d2
                            public final void LIZ(C0RAA c0raa) {
                                VideoAdaptionResult videoAdaptionResult = (VideoAdaptionResult) c0raa;
                                if (videoAdaptionResult != null) {
                                    Float translateY = videoAdaptionResult.getTranslateY();
                                    if (translateY != null) {
                                        FriendsDetailTransitionAssem friendsDetailTransitionAssem = this.LIZ;
                                        C786410Ut5.gd(friendsDetailTransitionAssem.Ip(), translateY.floatValue());
                                    }
                                    Integer numValueOf = Integer.valueOf(videoAdaptionResult.getHeight());
                                    if (numValueOf.intValue() > 0) {
                                        FriendsDetailTransitionAssem friendsDetailTransitionAssem2 = this.LIZ;
                                        friendsDetailTransitionAssem2.Tp(-1, numValueOf.intValue(), friendsDetailTransitionAssem2.Ip());
                                    }
                                }
                            }
                        }, false);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility
    public final boolean xN(boolean z) {
        Object obj;
        String aid;
        Object obj2;
        boolean zLJFF;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        if (!C729510SjV.LJJIJIL(((VideoItemParams) obj2).getAweme())) {
            return false;
        }
        Context contextLIZ = C724240Sb0.LIZ(this);
        if (contextLIZ == null) {
            contextLIZ = LJJIJL().getContext();
        }
        String aid3 = C0SUC.LIZ(contextLIZ).getAid();
        if (aid3 == null) {
            return false;
        }
        if (z && C296380BjY.LIZ()) {
            Aweme awemeLIZIZ = C1588330rR1.LIZIZ(aid);
            if (awemeLIZIZ != null) {
                aid2 = awemeLIZIZ.getAid();
            }
            zLJFF = Intrinsics.LJFF(aid, C1588330rR1.LIZ(aid2));
        } else {
            zLJFF = Intrinsics.LJFF(aid, aid3);
        }
        return !zLJFF;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.friends.ability.FriendsDetailTransitionAbility
    public final void zw0(Function0<Unit> function0) {
        int iXt0;
        Integer numValueOf;
        Integer numValueOf2;
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        if (this.LLLI) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (!C582980Mtk.LIZIZ(Bp()) && !C710930Rud.LJII(Bp()) && !C729510SjV.LJJIIZI(Bp())) {
            C719620SKq.LIZ(LLLLLLLZIL(), 0.3f, new AwS377S0200000_11(this, (FriendsDetailTransitionAssem) function0, (Function0<Unit>) 101));
            return;
        }
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJZ.getValue();
        if (iPhotoSlidesAbility != null) {
            iXt0 = iPhotoSlidesAbility.xt0();
        } else {
            iXt0 = 0;
        }
        Vp(Fp());
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(Bp(), iXt0, false);
        Bitmap bitmapLJIIL = null;
        if (photoModeImageLJIILIIL != null) {
            numValueOf = Integer.valueOf(photoModeImageLJIILIIL.width);
            numValueOf2 = Integer.valueOf(photoModeImageLJIILIIL.height);
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        Up(numValueOf, numValueOf2);
        IPhotoSlidesAbility iPhotoSlidesAbility2 = (IPhotoSlidesAbility) this.LLJZ.getValue();
        if (iPhotoSlidesAbility2 != null && (interfaceC719460SKaLJLIL = iPhotoSlidesAbility2.LJLIL()) != null) {
            bitmapLJIIL = interfaceC719460SKaLJLIL.LJIIL();
        }
        Ip().setTransitionName(C1888107aR.LIZIZ(Integer.valueOf(iXt0), Bp().getAid()));
        if (bitmapLJIIL != null) {
            Ip().setImageBitmap(bitmapLJIIL);
            this.LLLI = true;
        }
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
    }

    public final void Up(Integer num, Integer num2) {
        if (num != null && num2 != null && num.intValue() != 0 && num2.intValue() != 0) {
            Tp(-1, (LJJIJL().getWidth() * num2.intValue()) / num.intValue(), Ip());
        } else {
            Tp(-1, -2, Ip());
        }
    }

    public final void Tp(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
    }
}
