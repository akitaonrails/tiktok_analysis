package com.ss.android.ugc.aweme.tako.botpage.cards.answer.text;

import X.C01GW;
import X.C0HU8;
import X.C0HUA;
import X.C0HZQ;
import X.C123100dR;
import X.C1308910kAL;
import X.C13BV;
import X.C13EQ;
import X.C14J2;
import X.C1697810uHb;
import X.C1857040yQQ;
import X.C19MB;
import X.C2500209qy;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C452501pT;
import X.C723830SaL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1860810yWV;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultiBubbleAnswerTextAssem extends TakoAnswerBaseAssem<C1857040yQQ> {
    public final C01GW LLLLZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 729));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnb;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final /* bridge */ /* synthetic */ InterfaceC1860810yWV Tp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final ViewGroup Y4() {
        return (ViewGroup) LJJIJL().findViewById(R.id.erc);
    }

    public final List<C14J2> gs() {
        return C13EQ.LJJIJL(new C2500209qy(Y4(), 16), C14J2.class);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    public final void Vr(String str) {
        Context context = getContext();
        if (context != null) {
            C14J2 c14j2 = new C14J2(R.style.agl, 6, context, null);
            Y4().addView(c14j2);
            new C0HU8(c14j2, (TakoCardAbility) this.LLLLZLLLI.getValue()).LIZ(c14j2, new C0HUA(str));
        }
    }

    public final void Xr(C14J2 c14j2) {
        Wr(this, c14j2, 3, null, Float.valueOf(3.0f), Float.valueOf(8.0f), 4);
    }

    public final void Yr(C14J2 c14j2) {
        Float fValueOf = Float.valueOf(3.0f);
        Wr(this, c14j2, 2, null, fValueOf, fValueOf, 4);
    }

    public final void cs(C14J2 c14j2) {
        Wr(this, c14j2, 1, null, Float.valueOf(8.0f), Float.valueOf(3.0f), 4);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void ir(C19MB c19mb) {
        int i;
        int id = Y4().getId();
        if (gs().size() == 1) {
            i = 8;
        } else {
            i = 0;
        }
        c19mb.LJIIIZ(id, 3, R.id.o6x, 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: js, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C1857040yQQ c1857040yQQ) {
        List<String> listLJJLIIIJILLIZJL;
        String str = c1857040yQQ.LLJJIJIIJIL;
        int i = 0;
        if (str == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        } else {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"\u001d"}, 0, 6);
        }
        if (listLJJLIIIJILLIZJL.isEmpty()) {
            C786410Ut5.LJJZ(0, Y4().getChildCount(), Y4());
        } else {
            int size = gs().size();
            if (size == 0) {
                for (String str2 : listLJJLIIIJILLIZJL) {
                    if (C123100dR.LIZ(str2)) {
                        Vr(str2);
                    }
                }
            } else if (size == listLJJLIIIJILLIZJL.size()) {
                int i2 = 0;
                for (Object obj : listLJJLIIIJILLIZJL) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ns(i2, (String) obj);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else if (size < listLJJLIIIJILLIZJL.size()) {
                int i4 = 0;
                for (Object obj2 : listLJJLIIIJILLIZJL.subList(0, size)) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        ns(i4, (String) obj2);
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                for (String str3 : listLJJLIIIJILLIZJL.subList(size, listLJJLIIIJILLIZJL.size())) {
                    if (C123100dR.LIZ(str3)) {
                        Vr(str3);
                    }
                }
            } else {
                int i6 = 0;
                for (Object obj3 : listLJJLIIIJILLIZJL) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        ns(i6, (String) obj3);
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                int size2 = listLJJLIIIJILLIZJL.size();
                C786410Ut5.LJJZ(size2, Y4().getChildCount() - size2, Y4());
            }
        }
        int i8 = c1857040yQQ.LLJJIJI.LLILZ;
        List<C14J2> listGs = gs();
        int size3 = listGs.size();
        if (size3 != 1) {
            if (size3 != 2) {
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                int size4 = listGs.size();
                                while (i < size4) {
                                    if (i == gs().size() - 1) {
                                        Xr((C14J2) ListProtector.get(listGs, i));
                                    } else {
                                        Yr((C14J2) ListProtector.get(listGs, i));
                                    }
                                    i++;
                                }
                            }
                        } else {
                            int size5 = listGs.size();
                            while (i < size5) {
                                Yr((C14J2) ListProtector.get(listGs, i));
                                i++;
                            }
                        }
                    } else {
                        int size6 = listGs.size();
                        while (i < size6) {
                            if (i == 0) {
                                cs((C14J2) ListProtector.get(listGs, i));
                            } else {
                                Yr((C14J2) ListProtector.get(listGs, i));
                            }
                            i++;
                        }
                    }
                } else {
                    int size7 = listGs.size();
                    while (i < size7) {
                        if (i == 0) {
                            cs((C14J2) ListProtector.get(listGs, i));
                        } else if (i == gs().size() - 1) {
                            Xr((C14J2) ListProtector.get(listGs, i));
                        } else {
                            Yr((C14J2) ListProtector.get(listGs, i));
                        }
                        i++;
                    }
                }
            } else if (i8 != 0 && i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        Yr((C14J2) ListProtector.get(listGs, 0));
                        Xr((C14J2) ListProtector.get(listGs, 1));
                    }
                } else {
                    Yr((C14J2) ListProtector.get(listGs, 0));
                    Yr((C14J2) ListProtector.get(listGs, 1));
                }
            } else {
                cs((C14J2) ListProtector.get(listGs, 0));
                Xr((C14J2) ListProtector.get(listGs, 1));
            }
        } else {
            Wr(this, (C14J2) ListProtector.get(listGs, 0), i8, LJJIJL(), null, null, 24);
        }
        if (gs().size() > 1) {
            C0HZQ c0hzqBp = Bp();
            if (c0hzqBp != null) {
                ks(c0hzqBp);
            }
            C427660Gpo c427660GpoSp = sp();
            if (c427660GpoSp != null) {
                ks(c427660GpoSp);
            }
        }
        super.up(c1857040yQQ);
    }

    public final void ks(View view) {
        int marginStart;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        Integer numValueOf = Integer.valueOf(marginStart);
        Integer numValueOf2 = Integer.valueOf(Y4().getChildAt(0).getHeight() / 2);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        Integer numValueOf3 = Integer.valueOf(marginEnd);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i = marginLayoutParams.bottomMargin;
        }
        C426750GoL.LJIIIZ(view, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i), false, 16);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 213));
    }

    public final void ns(int i, String str) {
        C14J2 c14j2 = (C14J2) ListProtector.get(gs(), i);
        new C0HU8(c14j2, (TakoCardAbility) this.LLLLZLLLI.getValue()).LIZ(c14j2, new C0HUA(str));
    }

    public static void Wr(TakoMultiBubbleAnswerTextAssem takoMultiBubbleAnswerTextAssem, C14J2 c14j2, int i, View view, Float f, Float f2, int i2) {
        Integer numLIZJ;
        Float f3 = f2;
        Float f4 = f;
        View view2 = view;
        if ((i2 & 4) != 0) {
            view2 = null;
        }
        if ((i2 & 8) != 0) {
            f4 = null;
        }
        if ((i2 & 16) != 0) {
            f3 = null;
        }
        if (c14j2 != null) {
            takoMultiBubbleAnswerTextAssem.getClass();
            c14j2.setHasLeftTail(true);
        }
        Context context = takoMultiBubbleAnswerTextAssem.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            if (c14j2 != null) {
                c14j2.setBackgroundDrawColor(iIntValue);
            } else {
                return;
            }
        } else if (c14j2 == null) {
            return;
        }
        c14j2.LIZ(i, true, false, view2, null, null, f4, f3, false);
        c14j2.LIZIZ(null, null, null, Float.valueOf(C418440Gaw.LIZIZ(4)));
    }
}
