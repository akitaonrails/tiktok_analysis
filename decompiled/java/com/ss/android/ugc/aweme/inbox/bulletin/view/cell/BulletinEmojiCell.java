package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C0OQ6;
import X.C0P4N;
import X.C1196320hEk;
import X.C13LP;
import X.C1619980sG4;
import X.C19348710mr;
import X.C19374310qz;
import X.C2441009hQ;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19356310o5;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import Y.ALAdapterS6S0100000_9;
import Y.AUListenerS259S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinEmojiCellScope;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiCell extends PowerCell<BulletinEmojiItem> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(172));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 652));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 647));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 649));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 651));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 648));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 650));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 646));
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public View LLJIJIL;
    public ViewGroup LLJILJIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinEmojiCellScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7a;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEmojiCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public final BulletinCommonAbility N5() {
        return (BulletinCommonAbility) this.LLILLL.getValue();
    }

    public final int P5() {
        return ((Number) this.LLILZIL.getValue()).intValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.gzm);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.gzn);
        this.LLJILJIL = (ViewGroup) this.itemView.findViewById(R.id.gzl);
        this.LLJIJIL = this.itemView.findViewById(R.id.gzh);
        this.itemView.setBackground((Drawable) this.LLIZ.getValue());
        View view = this.LLJIJIL;
        if (view != null) {
            view.setBackground((Drawable) this.LLIZLLLIL.getValue());
        }
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 1), this.itemView);
        this.itemView.setOnLongClickListener(new C0P4N(this, 1));
    }

    public final void I5(BulletinEmojiItem bulletinEmojiItem) {
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(C19374310qz.LIZ(Long.valueOf(bulletinEmojiItem.count), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
        }
    }

    public final void L5(BulletinEmojiItem bulletinEmojiItem) {
        if (bulletinEmojiItem.isReaction) {
            View view = this.LLJIJIL;
            if (view != null) {
                if (bulletinEmojiItem.LLILLL) {
                    bulletinEmojiItem.LLILLL = false;
                    C786410Ut5.T4(view, 0.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJIJIL, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(150L);
                    objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(150L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS259S0100000_9(this, 0));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat);
                    animatorSet.playTogether(valueAnimatorOfFloat);
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new ALAdapterS6S0100000_9(this, 0));
                    animatorSet.start();
                } else {
                    C786410Ut5.T4(view, 1.0f);
                }
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.LLIZ.getValue();
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C2441009hQ.LJIIL(P5(), 0));
                return;
            }
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.0f);
        }
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.LLIZ.getValue();
        if (gradientDrawable2 == null) {
            return;
        }
        gradientDrawable2.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C2441009hQ.LJIIL(P5(), ((Number) this.LLILZLL.getValue()).intValue()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        BulletinEmojiItem bulletinEmojiItem = (BulletinEmojiItem) interfaceC1891350zJl;
        super.onBindItemView(bulletinEmojiItem);
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(bulletinEmojiItem.emoji);
        }
        I5(bulletinEmojiItem);
        L5(bulletinEmojiItem);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        TuxTextView tuxTextView;
        BulletinEmojiItem bulletinEmojiItem = (BulletinEmojiItem) interfaceC1891350zJl;
        super.onBindItemView(bulletinEmojiItem, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ != null && (objLJJJLZIJ instanceof C0OQ6)) {
            C0OQ6 c0oq6 = (C0OQ6) objLJJJLZIJ;
            if (c0oq6.LIZ && (tuxTextView = this.LLJ) != null) {
                tuxTextView.setText(bulletinEmojiItem.emoji);
            }
            if (c0oq6.LIZIZ) {
                I5(bulletinEmojiItem);
            }
            if (c0oq6.LIZJ) {
                L5(bulletinEmojiItem);
            }
        }
    }
}
