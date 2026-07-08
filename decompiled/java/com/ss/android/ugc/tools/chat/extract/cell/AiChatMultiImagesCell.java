package com.ss.android.ugc.tools.chat.extract.cell;

import X.C01GW;
import X.C0VSJ;
import X.C1158270gFN;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C21290818Tq;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.InterfaceC1891350zJl;
import X.InterfaceC427850Gq7;
import Y.ACListenerS155S0100000_21;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tools.chat.extract.cell.AiChatMultiImagesCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class AiChatMultiImagesCell extends PowerCell<C1158270gFN> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(421));
    public SmartImageView LLILLJJLI;
    public TuxSpinner LLILLL;
    public LinearLayout LLILZ;
    public C1158270gFN LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bg7;
    }

    public final void I5() {
        final C1158270gFN c1158270gFN;
        if (this.LLILLJJLI == null || (c1158270gFN = this.LLILZIL) == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIZ = u.LJJIIJZLJL(c1158270gFN.LL, "http", false) ? C1331660kl2.LJIIIZ(c1158270gFN.LL) : u.LJJIIJZLJL(c1158270gFN.LL, "file://", false) ? C1331660kl2.LJI(UriProtector.parse(c1158270gFN.LL)) : C1331660kl2.LJII(new C0VSJ(c1158270gFN.LL));
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI);
        c1331670kl3LJIIIZ.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0lQL
            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
                TuxSpinner tuxSpinner = this.LL.LLILLL;
                if (tuxSpinner != null) {
                    C786410Ut5.LJLLLLLL(0, tuxSpinner);
                }
                LinearLayout linearLayout = this.LL.LLILZ;
                if (linearLayout != null) {
                    C786410Ut5.LJLLLLLL(8, linearLayout);
                }
                if (this.LL.getBindingAdapterPosition() == 0) {
                    AiChatMultiImagesCell aiChatMultiImagesCell = this.LL;
                    if (aiChatMultiImagesCell.LLILZLL == 0) {
                        aiChatMultiImagesCell.LLILZLL = System.currentTimeMillis();
                    }
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                TuxSpinner tuxSpinner = this.LL.LLILLL;
                if (tuxSpinner != null) {
                    C786410Ut5.LJLLLLLL(8, tuxSpinner);
                }
                LinearLayout linearLayout = this.LL.LLILZ;
                if (linearLayout != null) {
                    C786410Ut5.LJLLLLLL(0, linearLayout);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadImage onFailed uri =");
                sbLIZ.append(uri);
                C21290818Tq.LIZIZ("AiChatMultiImagesCell", C2188811AlT.LIZIZ(sbLIZ), th);
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                String groupId;
                TuxSpinner tuxSpinner = this.LL.LLILLL;
                if (tuxSpinner != null) {
                    C786410Ut5.LJLLLLLL(8, tuxSpinner);
                }
                LinearLayout linearLayout = this.LL.LLILZ;
                if (linearLayout != null) {
                    C786410Ut5.LJLLLLLL(8, linearLayout);
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), C0PEM.LIZJ, null, new C1356240lOg(this.LL, c1158270gFN, c428600GrK, null), 2);
                if (this.LL.getBindingAdapterPosition() == 0) {
                    AiChatMultiImagesCell aiChatMultiImagesCell = this.LL;
                    if (!aiChatMultiImagesCell.LLIZ && aiChatMultiImagesCell.LLILZLL > 0) {
                        String strValueOf = String.valueOf(System.currentTimeMillis() - this.LL.LLILZLL);
                        Aweme aweme = c1158270gFN.LLILLL;
                        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
                            groupId = "";
                        }
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("item_id", groupId);
                        c0lab.LJ("duration", strValueOf);
                        c0lab.LJ("content_type", "multi_photo");
                        C20684815ws.LJIILLIIL("ai_comment_fe_page_monitor", c0lab.LIZ);
                        this.LL.LLIZ = true;
                    }
                }
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.drf);
        this.LLILLL = (TuxSpinner) this.itemView.findViewById(R.id.kdb);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.kei);
        this.LLILZ = linearLayout;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS155S0100000_21(this, 107));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1158270gFN c1158270gFN = (C1158270gFN) interfaceC1891350zJl;
        super.onBindItemView(c1158270gFN);
        this.LLILZIL = c1158270gFN;
        if (this.LLILLJJLI == null) {
            C21290818Tq.LIZIZ("AiChatMultiImagesCell", "onBindItemView: imageContainer is null", null);
        } else {
            I5();
        }
    }
}
