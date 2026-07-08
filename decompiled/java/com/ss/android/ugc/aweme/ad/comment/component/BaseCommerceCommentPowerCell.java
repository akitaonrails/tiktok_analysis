package com.ss.android.ugc.aweme.ad.comment.component;

import X.AbstractC1049440dPq;
import X.AbstractC1049500dPw;
import X.C01GW;
import X.C1049550dQ1;
import X.C1049570dQ3;
import X.C1381440m3K;
import X.C1627206Ys;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C452501pT;
import X.C707370Rot;
import X.EnumC1049490dPv;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCommerceCommentPowerCell<T extends AbstractC1049440dPq> extends PowerCell<T> implements View.OnLongClickListener, Observer<AbstractC1049500dPw> {
    public Comment LL;
    public String LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS560S0100000_16((BaseCommerceCommentPowerCell) this, 50));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(74));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(75));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16((BaseCommerceCommentPowerCell) this, 52));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16((BaseCommerceCommentPowerCell) this, 51));

    public final void I5() {
        String str = this.LLILLJJLI;
        if (str != null) {
            Comment comment = this.LL;
            C1049570dQ3.LIZ(str).LIZ(comment != null ? comment.getCid() : null).removeObserver(this);
            C1049550dQ1 c1049550dQ1LIZ = C1049570dQ3.LIZ(str);
            Comment comment2 = this.LL;
            String cid = comment2 != null ? comment2.getCid() : null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("commerce_comment_");
            sbLIZ.append(cid);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ((HashMap) C707370Rot.LIZ.LIZ).remove(strLIZIZ);
            c1049550dQ1LIZ.LIZJ.remove(strLIZIZ);
            if (cid != null) {
                c1049550dQ1LIZ.LIZ.remove(cid);
                c1049550dQ1LIZ.LIZJ.remove(cid);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemViewCreated: ");
        Comment comment = this.LL;
        sbLIZ.append(comment != null ? comment.getCid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C2211631BhB.LJ(this.itemView, new AwS595S0100000_16(this, 59));
        this.itemView.setOnLongClickListener(this);
        C1627206Ys.LIZ(this.itemView, EnumC1049490dPv.CELL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        I5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        if (this.LLILLJJLI != null) {
            I5();
        }
        this.LLILLJJLI = t.LIZIZ();
        this.LL = t.LIZ();
        String strLIZIZ = t.LIZIZ();
        NextLiveData<AbstractC1049500dPw> nextLiveDataLIZ = C1049570dQ3.LIZ(strLIZIZ).LIZ(t.LIZ().getCid());
        LifecycleOwner parent = getParent();
        if (parent == null) {
            nextLiveDataLIZ.observeForever(this, false);
        } else {
            nextLiveDataLIZ.observe(parent, this, false);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Pair pair;
        if (view == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCommentLongClick: view is ");
        sbLIZ.append(view);
        C2188811AlT.LIZIZ(sbLIZ);
        final Context context = view.getContext();
        Comment comment = this.LL;
        if (comment != null && comment.isTranslated()) {
            pair = new Pair(context.getResources().getString(R.string.suj), this.LLIZ.getValue());
        } else {
            pair = new Pair(context.getResources().getString(2131850744), this.LLILZLL.getValue());
        }
        final Pair[] pairArr = {pair, new Pair(context.getResources().getString(R.string.s65), this.LLILZIL.getValue()), new Pair(context.getResources().getString(2131829536), this.LLILZ.getValue())};
        C1381440m3K c1381440m3K = new C1381440m3K(context);
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        do {
            arrayList.add(pairArr[i].getFirst());
            i++;
        } while (i < 3);
        c1381440m3K.LIZ((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: X.0dPs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                pairArr[i2].getSecond().LIZ(context, this.LL);
            }
        });
        c1381440m3K.LIZIZ();
        return true;
    }
}
