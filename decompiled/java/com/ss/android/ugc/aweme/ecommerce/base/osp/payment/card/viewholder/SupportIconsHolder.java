package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder;

import X.AbstractC21673619ry;
import X.C0265007b;
import X.C0H1U;
import X.C0H9H;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C19MX;
import X.C21588719eH;
import X.C418440Gaw;
import X.C679280Qkg;
import X.C786410Ut5;
import X.C814003Fy;
import X.C870703aj;
import X.C946503mx;
import X.C946703mz;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SupportIconsHolder extends PowerCell<C0265007b> {
    public final C1331730kl9 LL;

    public SupportIconsHolder() {
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(2);
        this.LL = new C1331730kl9(c1331750klB);
        final int i = 0;
        new AbstractC21673619ry<C814003Fy>(i) { // from class: X.03Fx
            public final List<String> LL = new ArrayList();
            public final C1331730kl9 LLILLJJLI;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.size();
            }

            {
                C1331750klB c1331750klB2 = new C1331750klB();
                c1331750klB2.LJ = C418440Gaw.LIZIZ(2);
                this.LLILLJJLI = new C1331730kl9(c1331750klB2);
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                C814003Fy c814003Fy = (C814003Fy) viewHolder;
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(i2, this.LL);
                if (objLJJJLZIJ != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(objLJJJLZIJ);
                    c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, c814003Fy.LL.getContext()));
                    c1331670kl3LIZLLL.LJJ(c814003Fy.LLILLJJLI);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                C786410Ut5.a6(frameLayout, new RecyclerView.LayoutParams(-1, C0H9H.LIZIZ(30)));
                C426750GoL.LJIIIZ(frameLayout, null, null, null, Integer.valueOf(C0H9H.LIZIZ(12)), false, 23);
                SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
                C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(C0H9H.LIZIZ(48), C0H9H.LIZIZ(30), 17));
                smartImageView.setCircleOptions(this.LLILLJJLI);
                frameLayout.addView(smartImageView);
                C814003Fy c814003Fy = new C814003Fy(frameLayout, smartImageView);
                try {
                    View view = c814003Fy.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c814003Fy.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c814003Fy.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C814003Fy.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i2);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c814003Fy.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c814003Fy.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C814003Fy.class.getName();
                return c814003Fy;
            }
        };
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C870703aj.LIZ(this.itemView, new C21588719eH(C679280Qkg.LIZ(25), 0, 0, 0, false, 0, true, 254));
        C946503mx.LIZJ(this.itemView, new C946703mz(Integer.valueOf(C0H9H.LIZIZ(16)), null, Integer.valueOf(C0H9H.LIZIZ(16)), null));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        ViewGroup viewGroup;
        C0265007b c0265007b = (C0265007b) interfaceC1891350zJl;
        String str = c0265007b.LLILLJJLI;
        if (str != null && str.length() != 0) {
            string = c0265007b.LLILLJJLI;
        } else {
            string = this.itemView.getContext().getString(2131832912);
        }
        ((TextView) this.itemView.findViewById(R.id.title)).setText(string);
        for (String str2 : c0265007b.LL) {
            int iHashCode = str2.hashCode();
            SmartImageView smartImageView = new SmartImageView(this.itemView.getContext());
            C786410Ut5.G6(smartImageView, new ViewGroup.MarginLayoutParams(C0H9H.LIZIZ(48), C0H9H.LIZIZ(30)));
            smartImageView.setCircleOptions(this.LL);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str2);
            c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, this.itemView.getContext()));
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            smartImageView.setId(iHashCode);
            View view = this.itemView;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                C786410Ut5.LJJJLZIJ(view.findViewById(iHashCode), viewGroup);
                viewGroup.addView(smartImageView);
            }
            ((C19MX) this.itemView.findViewById(R.id.idf)).addView(smartImageView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C0H1U.LIZJ(R.layout.b09, viewGroup, false);
    }
}
