package com.ss.android.ugc.aweme.inbox.bulletin.assem.emojiselect;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0ORE;
import X.C1203130hPj;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1582480rHa;
import X.C1582580rHk;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C616840OHi;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC1166860gTE;
import X.InterfaceC1203170hPn;
import Y.AsS36S0100000_9;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.emojiselect.BulletinEmojiSelectSheetListAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiSelectSheetListAssem extends UIContentAssem {
    public C1203130hPj LLIZLLLIL;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C616840OHi.class, "BulletinSelectEmojiSheetHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public C0ORE LLJILJIL;
    public String LLJILJILJ;

    public BulletinEmojiSelectSheetListAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 373);
        this.LLJI = new C736950SvV(C13LE.LIZ(BulletinEmojiViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(219), new AwS550S0100000_6((AbstractC738140SxQ) this, 418), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 417));
        this.LLJILJILJ = "";
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        ((RecyclerView) this.LLJIJIL.getValue()).addOnScrollListener(new AsS36S0100000_9(this, 5));
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d4n) : null;
            this.LLIZLLLIL = (C1203130hPj) viewFindViewById;
        }
        C1203130hPj c1203130hPj = (C1203130hPj) viewFindViewById;
        if (c1203130hPj != null) {
            c1203130hPj.setVariant(EnumC1166860gTE.RECTANGLE);
            c1203130hPj.setWidthRule(new C1582580rHk(0, 0, 7));
            c1203130hPj.setSelectionStyle(new C1582480rHa(C1308910kAL.LIZJ(R.attr.a03, c1203130hPj.getContext()), C1308910kAL.LIZJ(R.attr.a1h, c1203130hPj.getContext()), C1308910kAL.LIZJ(R.attr.a1b, c1203130hPj.getContext()), C1308910kAL.LIZJ(R.attr.a1k, c1203130hPj.getContext())));
            c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0Oe8
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    C1203150hPl c1203150hPl;
                    CharSequence charSequence;
                    CharSequence charSequence2;
                    C0ORE c0ore;
                    List<InterfaceC1891350zJl> list;
                    List<C1203150hPl> list2;
                    if (z) {
                        C0ORE c0ore2 = this.LIZ.LLJILJIL;
                        if (c0ore2 != null && (list2 = c0ore2.LIZIZ) != null) {
                            c1203150hPl = (C1203150hPl) C13LP.LJJJLZIJ(i, list2);
                        } else {
                            c1203150hPl = null;
                        }
                        BulletinEmojiSelectSheetListAssem bulletinEmojiSelectSheetListAssem = this.LIZ;
                        if (c1203150hPl == null || (charSequence = c1203150hPl.LIZIZ) == null) {
                            charSequence = "";
                        }
                        bulletinEmojiSelectSheetListAssem.LLJILJILJ = (String) charSequence;
                        if ((abstractC1203190hPp instanceof C1203210hPr) && c1203150hPl != null && (charSequence2 = c1203150hPl.LIZIZ) != null && (c0ore = bulletinEmojiSelectSheetListAssem.LLJILJIL) != null && (list = c0ore.LIZ) != null) {
                            int i2 = 0;
                            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                                    if ((interfaceC1891350zJl2 instanceof C1274104yh) && Intrinsics.LJFF(((C1274104yh) interfaceC1891350zJl2).LL, charSequence2)) {
                                        ((LinearLayoutManager) ((RecyclerView) bulletinEmojiSelectSheetListAssem.LLJIJIL.getValue()).getLayoutManager()).scrollToPositionWithOffset(i2, 0);
                                    }
                                    i2 = i3;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((BulletinEmojiViewModel) this.LLJI.getValue()).init();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0ORO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ORD) obj).LLILLJJLI;
            }
        }, null, new AwS623S0100000_9(this, 48), 6);
    }
}
