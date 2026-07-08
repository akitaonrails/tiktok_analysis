package com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot;

import X.C01GW;
import X.C0PCY;
import X.C0PRC;
import X.C0PYV;
import X.C0Q4Y;
import X.C1110704Wb;
import X.C1308910kAL;
import X.C14TF;
import X.C1767106w1;
import X.C197039127h;
import X.C21565319aV;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C473401sq;
import X.C646370PWx;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.zhiliaoapp.musically.R;
import irm.AkS55S0200000_10;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoNewBotCardAssem extends ReusedUISlotAssem<SearchTakoNewBotCardAssem> implements InterfaceC712990Rxx<C0PYV> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 795));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 796));
    public C0PYV LLJLIL;
    public long LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public TuxIconView LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public TuxTextView LLLFFI;
    public ViewOnAttachStateChangeListenerC20604515jv LLLFZ;
    public View LLLI;
    public TuxTextView LLLII;
    public C197039127h LLLIIII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f3f;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final Map<String, String> getCommonParams() {
        String str;
        HashMap map = new HashMap();
        C646370PWx c646370PWxSp = sp();
        C0PRC c0prcOp = op();
        map.put("search_id", c0prcOp != null ? c0prcOp.LLILLL : null);
        map.put("search_result_id", c646370PWxSp != null ? c646370PWxSp.LLJ : null);
        map.put("enter_from", c646370PWxSp != null ? c646370PWxSp.LLILLL : null);
        map.put("token_type", "tikbot");
        map.put("rank", String.valueOf(c646370PWxSp != null ? Integer.valueOf(c646370PWxSp.LLILZLL) : null));
        map.put("universal_rank", String.valueOf(c646370PWxSp != null ? c646370PWxSp.LLJILJIL : null));
        if (c646370PWxSp == null || (str = c646370PWxSp.LLJILJILJ) == null) {
            str = "";
        }
        map.put("insert_type", str);
        map.put("search_keyword", c0prcOp != null ? c0prcOp.LLIZLLLIL : null);
        return map;
    }

    public final C0PRC op() {
        C0PCY<C0PRC> c0pcyPh1;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null) {
            return null;
        }
        return (C0PRC) c0pcyPh1.LIZJ();
    }

    public final C646370PWx sp() {
        C0PCY<C646370PWx> c0pcyWO2;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iSearchContextAbility == null || (c0pcyWO2 = iSearchContextAbility.wO2()) == null) {
            return null;
        }
        return (C646370PWx) c0pcyWO2.LIZJ();
    }

    public final void tp() {
        Integer num;
        if (this.LLJLLIL) {
            C14TF c14tf = C14TF.LIZIZ;
            ITakoMob iTakoMobLJJJLL = c14tf.LJJJLL();
            String strLJJJLIIL = c14tf.LJJJLIIL();
            C0PRC c0prcOp = op();
            String str = c0prcOp != null ? c0prcOp.LLILLL : null;
            C646370PWx c646370PWxSp = sp();
            iTakoMobLJJJLL.mobTikbotEntranceShow(strLJJJLIIL, "tako_brand_card", null, str, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (c646370PWxSp == null || (num = c646370PWxSp.LLJILJIL) == null) ? null : num.toString(), null, false);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        int iIntValue2;
        View viewFindViewById = view.findViewById(R.id.ucw);
        this.LLJLLL = viewFindViewById;
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            int[] iArr = new int[2];
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, view.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            iArr[0] = iIntValue;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, view.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            iArr[1] = iIntValue2;
            gradientDrawable.setColors(iArr);
            viewFindViewById.setBackground(gradientDrawable);
        }
        View viewFindViewById2 = view.findViewById(R.id.uck);
        this.LLJZIJLIL = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C21565319aV.LIZIZ(viewFindViewById2, Float.valueOf(C418440Gaw.LIZIZ(12)), null, null, null, null, 30);
        }
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            C786410Ut5.I7(new AkS55S0200000_10(this, view2, 2), view2);
        }
        View viewFindViewById3 = view.findViewById(R.id.ucv);
        this.LLJZ = viewFindViewById3;
        if (viewFindViewById3 != null) {
            C21565319aV.LIZIZ(viewFindViewById3, Float.valueOf(C418440Gaw.LIZIZ(12)), null, null, null, null, 30);
        }
        this.LLL = (TuxIconView) view.findViewById(R.id.ucr);
        this.LLLF = (TuxTextView) view.findViewById(R.id.uct);
        this.LLLFF = (TuxTextView) view.findViewById(R.id.ucs);
        this.LLLFFI = (TuxTextView) view.findViewById(R.id.ucx);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.ucq);
        this.LLLIIII = c197039127h;
        if (c197039127h != null) {
            C21565319aV.LIZIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(200)), null, null, null, null, 30);
        }
        C197039127h c197039127h2 = this.LLLIIII;
        if (c197039127h2 != null) {
            C427690Gpr.LJ(c197039127h2, C418440Gaw.LIZIZ(200));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ucu);
        this.LLLFZ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchTakoNewCardImageItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1767106w1(5));
        }
        this.LLLI = view.findViewById(R.id.ucl);
        this.LLLII = (TuxTextView) view.findViewById(R.id.ucn);
        C2211631BhB.LJ(view, new AwS589S0100000_10(this, 558));
        if (C1110704Wb.LIZ()) {
            C473401sq.LIZIZ(getContentView(), new AwS554S0100000_10(this, 1164), 0.0f, new AwS554S0100000_10(this, 1165), false, null, new AwS624S0100000_10(this, 121), 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0PYV r11) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot.SearchTakoNewBotCardAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0PYV c0pyv) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0PYV c0pyv) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
