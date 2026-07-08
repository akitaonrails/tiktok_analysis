package com.ss.android.ugc.aweme.im.b2c.card;

import X.AnonymousClass0652;
import X.C01GW;
import X.C0I6Y;
import X.C0I98;
import X.C1322090kVb;
import X.C1322110kVd;
import X.C1331070kk5;
import X.C1559260qg8;
import X.C341940Daq;
import X.C452501pT;
import X.C454440Hru;
import X.C461530I7z;
import X.C461640I8k;
import X.C462590ICb;
import X.C462620ICe;
import X.C462630ICf;
import X.C462680ICk;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.C912220ZqW;
import X.InterfaceC1587906Jp;
import X.InterfaceC462640ICg;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareProductReusedUISlot extends ReusedUISlotAssem<ShareProductReusedUISlot> implements InterfaceC712990Rxx<InterfaceC462640ICg> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 120));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 121));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 125));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 126));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 124));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 122));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 123));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 139));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(57));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm3;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C461640I8k.LIZ.LIZ(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL, (View) this.LLJL.getValue());
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 27), (View) this.LLJL.getValue());
    }

    public final void op(C462620ICe c462620ICe) {
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(c462620ICe, LJJIJL()));
        C462630ICf c462630ICf = c462620ICe.LIZ;
        ((C1331070kk5) ((C1322090kVb) this.LLJLIL.getValue()).getHierarchy()).LJJIII(C912220ZqW.LIZIZ(LJJIJL().getContext(), c462630ICf.LIZ, c462630ICf.LIZIZ, 0.0f, 0.0f));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC462640ICg interfaceC462640ICg) {
        InterfaceC462640ICg interfaceC462640ICg2 = interfaceC462640ICg;
        sp((ShareProductContent) BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ(interfaceC462640ICg2), ShareProductContent.class));
        op(interfaceC462640ICg2.LIZJ());
    }

    public final void sp(ShareProductContent shareProductContent) {
        UrlModel picture;
        final float fLIZ;
        UrlModel picture2;
        UrlModel sellerAvatar;
        String sellerName;
        String title;
        String price;
        String sales;
        int i;
        String sales2 = null;
        if (shareProductContent != null) {
            picture = shareProductContent.getPicture();
        } else {
            picture = null;
        }
        if (((View) this.LLJLIL.getValue()).getLayoutParams() != null && picture != null && picture.getWidth() > 0 && picture.getHeight() > 0) {
            fLIZ = C341940Daq.LIZ(picture.getHeight()) / C341940Daq.LIZ(picture.getWidth());
        } else {
            fLIZ = 1.0f;
        }
        ((View) this.LLJLIL.getValue()).addOnLayoutChangeListener(new View.OnLayoutChangeListener(fLIZ) { // from class: X.0I8q
            public final float LL;

            {
                this.LL = fLIZ;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (view == null) {
                    return;
                }
                int i10 = i5 - i3;
                int i11 = (int) ((i4 - i2) * this.LL);
                if (i11 != i10) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = i11;
                        C786410Ut5.W5(view, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                view.removeOnLayoutChangeListener(this);
            }
        });
        C1322110kVd c1322110kVd = (C1322110kVd) this.LLJLIL.getValue();
        if (shareProductContent != null) {
            picture2 = shareProductContent.getPicture();
        } else {
            picture2 = null;
        }
        C0I98.LIZLLL(c1322110kVd, picture2, "ImShareDialog:product", (Drawable) this.LLJZIJLIL.getValue(), (Drawable) this.LLJZIJLIL.getValue(), null, null, 0, 0, null, C454440Hru.LIZ());
        C1322110kVd c1322110kVd2 = (C1322110kVd) this.LLJLILLLLZIIL.getValue();
        if (shareProductContent != null) {
            sellerAvatar = shareProductContent.getSellerAvatar();
        } else {
            sellerAvatar = null;
        }
        C0I98.LJI(c1322110kVd2, sellerAvatar, "ImShareDialog:product", ((Number) this.LLL.getValue()).intValue(), ((Number) this.LLL.getValue()).intValue(), null, null, 0, 0, null, C454440Hru.LIZ(), 992);
        TextView textView = (TextView) this.LLJLL.getValue();
        if (shareProductContent != null) {
            sellerName = shareProductContent.getSellerName();
        } else {
            sellerName = null;
        }
        textView.setText(sellerName);
        TextView textView2 = (TextView) this.LLJLLIL.getValue();
        if (shareProductContent != null) {
            title = shareProductContent.getTitle();
        } else {
            title = null;
        }
        textView2.setText(title);
        TextView textView3 = (TextView) this.LLJLLL.getValue();
        if (shareProductContent != null) {
            price = shareProductContent.getPrice();
        } else {
            price = null;
        }
        textView3.setText(price);
        TextView textView4 = (TextView) this.LLJZ.getValue();
        if (shareProductContent != null) {
            sales = shareProductContent.getSales();
        } else {
            sales = null;
        }
        textView4.setText(sales);
        TuxTextView tuxTextView = (TuxTextView) this.LLJZ.getValue();
        if (shareProductContent != null) {
            sales2 = shareProductContent.getSales();
        }
        if (AnonymousClass0652.LIZ(sales2)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC462640ICg interfaceC462640ICg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC462640ICg interfaceC462640ICg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C462680ICk c462680ICk;
        InterfaceC462640ICg interfaceC462640ICg = (InterfaceC462640ICg) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C462680ICk) && (c462680ICk = (C462680ICk) obj2) != null) {
                    if (c462680ICk.LIZ) {
                        sp((ShareProductContent) BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ(interfaceC462640ICg), ShareProductContent.class));
                    }
                    if (c462680ICk.LIZIZ) {
                        op(interfaceC462640ICg.LIZJ());
                    }
                }
            }
            return;
        }
        sp((ShareProductContent) BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ(interfaceC462640ICg), ShareProductContent.class));
        op(interfaceC462640ICg.LIZJ());
    }
}
