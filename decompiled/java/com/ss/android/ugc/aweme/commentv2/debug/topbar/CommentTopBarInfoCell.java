package com.ss.android.ugc.aweme.commentv2.debug.topbar;

import X.C1344990l6X;
import X.C1350400lFG;
import X.C1350470lFN;
import X.C1697810uHb;
import X.C197039127h;
import X.C2188811AlT;
import X.C295960Bis;
import X.C745490TMd;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.debug.CommentDebugBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentTopBarInfoCell extends CommentDebugBaseCell<C745490TMd> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String aid;
        boolean z;
        boolean z2;
        String aid2;
        int size;
        String strK3;
        C745490TMd c745490TMd = (C745490TMd) interfaceC1891350zJl;
        super.onBindItemView(c745490TMd);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            Aweme aweme = c745490TMd.LL;
            C1350470lFN.LIZ.getClass();
            Integer numLJI = C1350470lFN.LJI(aweme);
            Map<String, String> map = C1350470lFN.LIZJ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            String str = (String) ((LinkedHashMap) map).get(aid);
            List listLIZLLL = C1350470lFN.LIZLLL(aweme, false);
            StringBuilder sb = new StringBuilder("***** version info *****\n");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use refactor version: ");
            boolean z3 = true;
            if (numLJI != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", bizType = ");
            sbLIZ.append(numLJI);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("use old version: ");
            if (str != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ2.append(z2);
            sbLIZ2.append(", oldComponentTag = ");
            sbLIZ2.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n\n***** experiment config Info *****\n");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("comment top bar refactor exp value: ");
            sbLIZ3.append(C295960Bis.LIZ());
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append("\n");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("comment top bar refactor biz settings config: ");
            sbLIZ4.append(C1350400lFG.LIZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            sb.append("\n\n***** origin aweme Info *****\n");
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("aid : ");
            if (aweme != null) {
                aid2 = aweme.getAid();
            } else {
                aid2 = null;
            }
            sbLIZ5.append(aid2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            sb.append("\n");
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("commentTopBarComponent is empty: ");
            if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
                z3 = false;
            }
            sbLIZ6.append(z3);
            sbLIZ6.append(", size = ");
            if (listLIZLLL != null) {
                size = listLIZLLL.size();
            } else {
                size = 0;
            }
            sbLIZ6.append(size);
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
            sb.append("\ncommentTopBarComponent origin data:\n");
            if (listLIZLLL != null) {
                int i = 0;
                for (Object obj : listLIZLLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("index: ");
                        sbLIZ7.append(i);
                        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
                        sb.append("\n");
                        try {
                            strK3 = C786410Ut5.K3(4, new JSONObject(GsonProtectorUtils.toJson(C1344990l6X.LIZ, obj)));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            strK3 = "";
                        }
                        sb.append(strK3);
                        sb.append("\n\n");
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            tuxTextView.setText(sb.toString());
        }
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            c197039127h2.setText("show/hide Focus mask view");
        }
        C197039127h c197039127h3 = this.LLILLL;
        if (c197039127h3 != null) {
            C786410Ut5.LLLLLLJ(c197039127h3, 0);
        }
        C197039127h c197039127h4 = this.LLILLL;
        if (c197039127h4 != null) {
            C786410Ut5.U8(c197039127h4, new View.OnClickListener() { // from class: X.0l29
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1342230l25.LJIIJJI = !C1342230l25.LJIIJJI;
                }
            });
        }
    }
}
