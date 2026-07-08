package com.ss.android.ugc.aweme.tako.nimblecard;

import X.AnonymousClass0652;
import X.C01GW;
import X.C0HZQ;
import X.C123100dR;
import X.C1857380yQy;
import X.C1858830yTJ;
import X.C1858900yTQ;
import X.C19ME;
import X.C259800zU;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C452501pT;
import X.C723830SaL;
import X.C814420VxA;
import X.EnumC1858880yTO;
import X.InterfaceC1860810yWV;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.nimblecard.model.Component;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS122S0400000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class NimbleCardAnswerAssem extends TakoAnswerBaseAssem<C1858830yTJ> {
    public final int LLLLZLLLI;
    public final C01GW LLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 880));
    public final C1858900yTQ LLLZI = new Object() { // from class: X.0yTQ
        public static final /* synthetic */ int LIZ = 0;
    };
    public final C1857380yQy LLLZIIL = new C1857380yQy();

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void Kq() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmk;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final void jr() {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility
    public final int t70() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        C1857380yQy c1857380yQy = this.LLLZIIL;
        Template templateVr = Vr();
        c1857380yQy.getClass();
        if (C1857380yQy.LIZJ(templateVr)) {
            return (C0HZQ) LJJIJL().findViewById(R.id.umx);
        }
        return null;
    }

    public final Template Vr() {
        return (Template) this.LLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        C1857380yQy c1857380yQy = this.LLLZIIL;
        Template templateVr = Vr();
        c1857380yQy.getClass();
        if (C1857380yQy.LIZJ(templateVr)) {
            return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        return pq();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0yTQ] */
    public NimbleCardAnswerAssem(int i) {
        this.LLLLZLLLI = i;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Wr, reason: merged with bridge method [inline-methods] */
    public final void up(C1858830yTJ c1858830yTJ) {
        View viewFindViewById;
        List<Component> list;
        List<Component> list2;
        boolean zLIZ;
        List<TakoProductItem> list3;
        super.up(c1858830yTJ);
        Template templateVr = Vr();
        EnumC1858880yTO enumC1858880yTO = EnumC1858880yTO.TAKO_LYNX;
        int i = 0;
        if (templateVr != null && (list = templateVr.components) != null && !list.isEmpty()) {
            Iterator<Component> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().id, enumC1858880yTO.getTag())) {
                    Map<String, Object> map = c1858830yTJ.LLLIIL;
                    if (map != null) {
                        Template templateVr2 = Vr();
                        if (templateVr2 != null && (list2 = templateVr2.components) != null) {
                            i = 0;
                            for (Component component : list2) {
                                String str = component.id;
                                EnumC1858880yTO enumC1858880yTO2 = EnumC1858880yTO.TAKO_LYNX;
                                if (Intrinsics.LJFF(str, enumC1858880yTO2.getTag())) {
                                    break;
                                }
                                String str2 = component.id;
                                if (Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_MARKDOWN_TEXT.getTag())) {
                                    zLIZ = AnonymousClass0652.LIZ(c1858830yTJ.LLJJJ);
                                } else if (Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_USER.getTag())) {
                                    if (c1858830yTJ.LLJJJJLIIL != null) {
                                        i++;
                                    }
                                } else {
                                    if (!Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_INTERACTION.getTag()) && !Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_MESSAGE_DISCLAIMER.getTag())) {
                                        if (Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_HORIZONTAL_VIDEO.getTag())) {
                                            if (c1858830yTJ.LLJJL == null || !(!r0.isEmpty())) {
                                            }
                                        } else if (Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_INTENT_VIDEO.getTag())) {
                                            if (c1858830yTJ.LLJJL == null || !(!r0.isEmpty())) {
                                            }
                                        } else if (Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_HORIZONTAL_USER.getTag())) {
                                            if (c1858830yTJ.LLJJLIIIJLLLLLLLZ == null || !(!r0.isEmpty())) {
                                            }
                                        } else if (Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_GOODS.getTag())) {
                                            TakoProductInfo takoProductInfo = c1858830yTJ.LLJL;
                                            if (takoProductInfo == null || (list3 = takoProductInfo.items) == null || !(!list3.isEmpty())) {
                                            }
                                        } else if (!Intrinsics.LJFF(str2, EnumC1858880yTO.TAKO_IMAGE.getTag())) {
                                            if (Intrinsics.LJFF(str2, enumC1858880yTO2.getTag())) {
                                                zLIZ = AnonymousClass0652.LIZ(c1858830yTJ.LLLIIIIL);
                                            }
                                        }
                                    }
                                    i++;
                                }
                                if (zLIZ) {
                                    i++;
                                }
                            }
                        }
                        map.put("rank", Integer.valueOf(i));
                    }
                    Map<String, Object> map2 = c1858830yTJ.LLLIIL;
                    if (map2 != null) {
                        map2.putAll(c1858830yTJ.LLJJIJI.LLILLL.LJI);
                    }
                }
            }
        }
        if (up() && C123100dR.LIZ(c1858830yTJ.LLJJJ) && (viewFindViewById = LJJIJL().findViewById(R.id.esi)) != null) {
            C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, false, 29);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        List<Component> list;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Template templateVr;
        super.onViewCreated(view);
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (templateVr = Vr()) != null) {
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(templateVr.padding, 0)));
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(templateVr.padding, 1))));
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(templateVr.padding, 2)));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(templateVr.padding, 3))));
        }
        Template templateVr2 = Vr();
        if (templateVr2 != null && (list = templateVr2.components) != null) {
            C723830SaL.LIZ(this, null, new AwS122S0400000_27((List) list, (List<Component>) this, (NimbleCardAnswerAssem) new C259800zU(), (C259800zU<Integer>) templateVr2, (Template) 4));
        }
    }
}
