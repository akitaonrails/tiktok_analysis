package com.ss.android.ugc.aweme.tako.botpage.components.sug;

import X.C019F;
import X.C01GW;
import X.C0DSB;
import X.C0DXR;
import X.C12NU;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1857280yQo;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC19408510wV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TakoMixCardSugAssem extends ReusedUISlotAssem<TakoMixCardSugAssem> implements InterfaceC712990Rxx<InterfaceC19408510wV> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 501));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 503));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 504));
    public final AssemVMLazy LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMixCardSugAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoMixCardSugAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS573S0100000_29(c19719912DlLIZ, 502), AFwS273S0000000_29.get$arr$(159), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fl6;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoMixCardSugItemCell.class);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC19408510wV interfaceC19408510wV) {
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        RecyclerView.LayoutManager linearLayoutManager;
        int i;
        C0DXR c0dxr;
        final InterfaceC19408510wV interfaceC19408510wV2 = interfaceC19408510wV;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            TakoSug takoSug = interfaceC19408510wV2.LJIL().LLILLJJLI;
            Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
            int i2 = takoSug.sugShowType;
            if (i2 == 102) {
                linearLayoutManager = new GridLayoutManager(context, 2);
            } else {
                if (i2 == 100) {
                    i = 0;
                } else {
                    i = 1;
                }
                linearLayoutManager = new LinearLayoutManager(context, i, false);
            }
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
            final boolean zLIZ = C1857280yQo.LIZ((TakoCardAbility) this.LLJLIL.getValue());
            final int iLIZ = (int) C0DSB.LIZ(8);
            if (interfaceC19408510wV2.LJIL().LLILLJJLI.sugShowType == 100) {
                c0dxr = new C0DXR() { // from class: X.10wT
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        Pair pair;
                        Object first;
                        Object second;
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                        int iIntValue = 0;
                        if (childAdapterPosition == 0) {
                            Integer numLIZ = interfaceC19408510wV2.LIZ();
                            if (numLIZ != null) {
                                iIntValue = numLIZ.intValue();
                            }
                            pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iLIZ / 2));
                        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
                            Integer numValueOf = Integer.valueOf(iLIZ / 2);
                            Integer numLIZIZ = interfaceC19408510wV2.LIZIZ();
                            if (numLIZIZ != null) {
                                iIntValue = numLIZIZ.intValue();
                            }
                            pair = new Pair(numValueOf, Integer.valueOf(iIntValue));
                        } else {
                            pair = new Pair(Integer.valueOf(iLIZ / 2), Integer.valueOf(iLIZ / 2));
                        }
                        if (zLIZ) {
                            first = pair.getSecond();
                        } else {
                            first = pair.getFirst();
                        }
                        rect.left = ((Number) first).intValue();
                        if (zLIZ) {
                            second = pair.getFirst();
                        } else {
                            second = pair.getSecond();
                        }
                        rect.right = ((Number) second).intValue();
                    }
                };
            } else if (interfaceC19408510wV2.LJIL().LLILLJJLI.sugShowType == 101) {
                c0dxr = new C0DXR() { // from class: X.10wS
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        int iIntValue;
                        Object first;
                        Object second;
                        int iIntValue2 = 0;
                        if (recyclerView.getChildAdapterPosition(view) == 0) {
                            rect.top = 0;
                        } else {
                            rect.top = iLIZ;
                        }
                        Integer numLIZ = interfaceC19408510wV2.LIZ();
                        if (numLIZ != null) {
                            iIntValue = numLIZ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Integer numLIZIZ = interfaceC19408510wV2.LIZIZ();
                        if (numLIZIZ != null) {
                            iIntValue2 = numLIZIZ.intValue();
                        }
                        Pair pair = new Pair(numValueOf, Integer.valueOf(iIntValue2));
                        if (zLIZ) {
                            first = pair.getSecond();
                        } else {
                            first = pair.getFirst();
                        }
                        rect.left = ((Number) first).intValue();
                        if (zLIZ) {
                            second = pair.getFirst();
                        } else {
                            second = pair.getSecond();
                        }
                        rect.right = ((Number) second).intValue();
                    }
                };
            } else {
                c0dxr = new C0DXR() { // from class: X.10wU
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        int iLIZ2 = (int) C0DSB.LIZ(4);
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                        int i3 = childAdapterPosition % 2;
                        int i4 = childAdapterPosition / 2;
                        int iIntValue = 0;
                        rect.set(0, 0, 0, 0);
                        if (i3 == 1) {
                            if (zLIZ) {
                                rect.right = iLIZ2;
                                Integer numLIZIZ = interfaceC19408510wV2.LIZIZ();
                                if (numLIZIZ != null) {
                                    iIntValue = numLIZIZ.intValue();
                                }
                                rect.left = iIntValue;
                            } else {
                                rect.left = iLIZ2;
                                Integer numLIZIZ2 = interfaceC19408510wV2.LIZIZ();
                                if (numLIZIZ2 != null) {
                                    iIntValue = numLIZIZ2.intValue();
                                }
                                rect.right = iIntValue;
                            }
                        } else if (zLIZ) {
                            Integer numLIZ = interfaceC19408510wV2.LIZ();
                            if (numLIZ != null) {
                                iIntValue = numLIZ.intValue();
                            }
                            rect.right = iIntValue;
                        } else {
                            Integer numLIZ2 = interfaceC19408510wV2.LIZ();
                            if (numLIZ2 != null) {
                                iIntValue = numLIZ2.intValue();
                            }
                            rect.left = iIntValue;
                        }
                        if (i4 > 0) {
                            rect.top = iLIZ2;
                        }
                    }
                };
            }
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c0dxr);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            state2.LJFF(null);
        }
        Iterator<String> it2 = interfaceC19408510wV2.LJIL().LLILLJJLI.sugList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            it2.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJLIIIJLLLLLLLZ;
                if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                    C20600815jK.LIZJ(state, new C12NU(interfaceC19408510wV2.LJIL(), i3, new AwS464S0200000_29(this, interfaceC19408510wV2, 6), new AwS464S0200000_29(this, interfaceC19408510wV2, 7), C1558520qew.LJIIL(this)));
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC19408510wV interfaceC19408510wV) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC19408510wV interfaceC19408510wV) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
