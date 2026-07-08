package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.AbstractC693100RGq;
import X.C01GW;
import X.C03H5;
import X.C0RJN;
import X.C0SZ8;
import X.C0WIY;
import X.C123100dR;
import X.C1389300mG0;
import X.C13LE;
import X.C1558520qew;
import X.C1590480rUU;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C693080RGo;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC665370Q7z;
import X.InterfaceC693170RGx;
import X.InterfaceC739930T0t;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.casting.api.ICastingAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.SingleTapSwitchSubVHAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseSubVHTapTouchInterceptComponent<RECEIVER extends C03H5> extends BaseCellContentComponent<RECEIVER> implements PanelSingleTapInterceptAbility, InterfaceC693170RGx {
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(167));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11((BaseSubVHTapTouchInterceptComponent) this, 327));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11((BaseSubVHTapTouchInterceptComponent) this, 328));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11((BaseSubVHTapTouchInterceptComponent) this, 329));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11((BaseSubVHTapTouchInterceptComponent) this, 326));
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS555S0100000_11((BaseSubVHTapTouchInterceptComponent) this, 330));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract AbstractC693100RGq hp(float f, float f2, int i, long j);

    @Override // X.InterfaceC693170RGx
    public void tm(boolean z) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, PanelSingleTapInterceptAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnselected, aid = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJJJLIIL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, PanelSingleTapInterceptAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0RGr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, new AwS625S0100000_11(this, 25), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0RGs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, new AwS625S0100000_11(this, 26), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0RGu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJI;
            }
        }, null, new AwS625S0100000_11(this, 27), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0RGt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILJILJ;
            }
        }, null, new AwS625S0100000_11(this, 28), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected, position = ");
        sbLIZ.append(i);
        sbLIZ.append(", aid = ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJJJLIIL = false;
    }

    public final void ep(float f, float f2, boolean z) {
        Object obj;
        C0SZ8 c0sz8J92;
        InterfaceC739930T0t interfaceC739930T0tLJIJJLI;
        String aid;
        Object obj2;
        String aid2;
        Object obj3;
        C2189821An6 c2189821An6;
        Object obj4;
        IPlayerComponentAbility iPlayerComponentAbility;
        Object obj5;
        C0SZ8 c0sz8J922;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String eventType = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null && C123100dR.LIZ(aid)) {
            getContext();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            C20684815ws.LJIIJJI("click", 0L, "video", aid2);
            CollectionVHAbility collectionVHAbility = (CollectionVHAbility) this.LLJL.getValue();
            if (collectionVHAbility != null && (c0sz8J922 = collectionVHAbility.j92()) != null) {
                c0sz8J922.LLZ();
            }
            if (z && (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJLIL.getValue()) != null) {
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (c724270Sb33 != null) {
                    obj5 = c724270Sb33.LL;
                } else {
                    obj5 = null;
                }
                iPlayerComponentAbility.Y2(((VideoItemParams) obj5).getAweme(), false, true);
            }
            ICastingAbility iCastingAbility = (ICastingAbility) this.LLJLILLLLZIIL.getValue();
            if (iCastingAbility != null) {
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj4 = c724270Sb34.LL;
                } else {
                    obj4 = null;
                }
                ((VideoItemParams) obj4).getAweme();
                iCastingAbility.Qh1();
            }
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            if (c0rjnLIZIZ != null && C1389300mG0.LJIJJ(c0rjnLIZIZ)) {
                C1590480rUU c1590480rUU = C1590480rUU.LIZ;
                Float fValueOf = Float.valueOf(f);
                Float fValueOf2 = Float.valueOf(f2);
                C724270Sb3 c724270Sb35 = this.LLJI;
                if (c724270Sb35 != null) {
                    obj3 = c724270Sb35.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme3 = ((VideoItemParams) obj3).getAweme();
                C0RJN c0rjnLIZIZ2 = jm().LIZIZ();
                if (c0rjnLIZIZ2 != null && (c2189821An6 = c0rjnLIZIZ2.LIZJ) != null) {
                    eventType = c2189821An6.getEventType();
                }
                c1590480rUU.getClass();
                C1590480rUU.LIZLLL(fValueOf, fValueOf2, aweme3, eventType);
            }
        }
        CollectionVHAbility collectionVHAbility2 = (CollectionVHAbility) this.LLJL.getValue();
        if (collectionVHAbility2 != null && (c0sz8J92 = collectionVHAbility2.j92()) != null && (interfaceC739930T0tLJIJJLI = c0sz8J92.LJIJJLI()) != null) {
            interfaceC739930T0tLJIJJLI.no();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility
    public boolean tw0(int i, long j, Object obj) {
        Object obj2;
        Float f;
        Object obj3;
        Float f2;
        Object obj4;
        boolean z;
        AbstractC693100RGq abstractC693100RGqHp;
        SingleTapSwitchSubVHAbility singleTapSwitchSubVHAbility;
        SingleTapSwitchSubVHAbility singleTapSwitchSubVHAbility2;
        List<InteractStickerStruct> interactStickerStructs;
        C0WIY c0wiy;
        C0WIY c0wiy2;
        boolean z2 = obj instanceof C0WIY;
        Object obj5 = null;
        if (z2 && (c0wiy2 = (C0WIY) obj) != null) {
            obj2 = c0wiy2.LIZ;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Float) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        if (z2 && (c0wiy = (C0WIY) obj) != null) {
            obj3 = c0wiy.LIZIZ;
        } else {
            obj3 = null;
        }
        if (obj3 instanceof Float) {
            f2 = (Float) obj3;
        } else {
            f2 = null;
        }
        if (obj != null && f != null && f2 != null) {
            SingleTapSwitchSubVHAbility singleTapSwitchSubVHAbility3 = (SingleTapSwitchSubVHAbility) this.LLJLL.getValue();
            if (singleTapSwitchSubVHAbility3 != null && singleTapSwitchSubVHAbility3.jZ0()) {
                ip(f, f2, i, j);
                return false;
            }
            float fFloatValue = f.floatValue();
            float fFloatValue2 = f2.floatValue();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj4 = c724270Sb3.LL;
            } else {
                obj4 = null;
            }
            Aweme aweme = ((VideoItemParams) obj4).getAweme();
            if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null && !interactStickerStructs.isEmpty()) {
                Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getType() == 19) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj5 = c724270Sb32.LL;
            }
            if (((VideoItemParams) obj5).getAweme().getInteractStickerStructs() != null && (!r0.isEmpty()) && this.LLJJJJLIIL) {
                if (z) {
                    ip(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), i, j);
                }
                abstractC693100RGqHp = new C693080RGo(true, true, 0, 4);
            } else {
                abstractC693100RGqHp = hp(f.floatValue(), f2.floatValue(), i, j);
            }
            if (abstractC693100RGqHp.LIZ) {
                if (abstractC693100RGqHp.LIZJ) {
                    ep(f.floatValue(), f2.floatValue(), abstractC693100RGqHp.LIZIZ);
                }
                if ((abstractC693100RGqHp instanceof C693080RGo) && (singleTapSwitchSubVHAbility2 = (SingleTapSwitchSubVHAbility) this.LLJLL.getValue()) != null) {
                    singleTapSwitchSubVHAbility2.f11();
                }
                return true;
            }
            Context context = getContext();
            if (context != null && (singleTapSwitchSubVHAbility = (SingleTapSwitchSubVHAbility) this.LLJLL.getValue()) != null) {
                float fFloatValue3 = f.floatValue();
                f2.floatValue();
                singleTapSwitchSubVHAbility.Vw2(context, fFloatValue3, this);
                ep(f.floatValue(), f2.floatValue(), false);
                return true;
            }
            ip(f, f2, i, j);
            return false;
        }
        ip(f, f2, i, j);
        return false;
    }

    public void ip(Float f, Float f2, int i, long j) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        CellStickerComponentAbility cellStickerComponentAbility;
        if (f != null && f2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue()) != null && (cellStickerComponentAbility = (CellStickerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7z, CellStickerComponentAbility.class, null)) != null) {
            cellStickerComponentAbility.UG(f.floatValue(), f2.floatValue(), i);
        }
    }
}
