package com.ss.android.ugc.aweme.im.sticker.impl.ui;

import X.AbstractC450910HmD;
import X.C0DXR;
import X.C0HYK;
import X.C0IDE;
import X.C1383370m6R;
import X.C13LP;
import X.C1419705h5;
import X.C21673919s1;
import X.C270150AiL;
import X.C418440Gaw;
import X.C443060HYy;
import X.C449640HkA;
import X.C450970HmJ;
import X.C450980HmK;
import X.C450990HmL;
import X.C451000HmM;
import X.C451010HmN;
import X.C451030HmP;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS133S0201000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerGridAdapter extends AbstractC450910HmD<C451030HmP> {
    public final LifecycleOwner LLILZIL;
    public final Context LLILZLL;
    public final int LLIZ;
    public final Integer LLIZLLLIL;
    public final Integer LLJ;
    public final Function1<C21673919s1, Unit> LLJI;
    public final int LLJIJIL;
    public C451010HmN LLJILJIL;

    @Override // X.AbstractC450910HmD
    public final int LLLII() {
        return R.layout.c3l;
    }

    @Override // X.AbstractC450910HmD
    public final int LLLIILIL() {
        return this.LLJILJIL.LIZIZ;
    }

    @Override // X.AbstractC450910HmD
    public final void LLLIIIIL(RecyclerView recyclerView) {
        super.LLLIIIIL(recyclerView);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        int i = this.LLJIJIL;
        final boolean z = false;
        marginLayoutParams.setMargins(i, 0, i, 0);
        final Context context = this.LL;
        final int i2 = this.LLJILJIL.LIZJ;
        recyclerView.setLayoutManager(new WrapGridLayoutManager(context, i2) { // from class: com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridAdapter$setup$lm$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                super.onLayoutCompleted(c21673919s1);
                this.LLJI.LLJI.invoke(c21673919s1);
            }
        });
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i3 = 0; i3 < itemDecorationCount; i3++) {
            recyclerView.removeItemDecorationAt(i3);
        }
        final int i4 = this.LLJILJIL.LIZIZ;
        if (this.LLIZ != 10) {
            z = true;
        }
        final Integer num = this.LLIZLLLIL;
        recyclerView.addItemDecoration(new C0DXR(num, i4, i4, z) { // from class: X.0DWn
            public final int LL;
            public final int LLILLJJLI;
            public final boolean LLILLL;
            public final Integer LLILZ;
            public final boolean LLILZIL;

            {
                this.LL = i4;
                this.LLILLJJLI = i4;
                this.LLILLL = z;
                this.LLILZ = num;
                C0I0B.LJFF.LIZJ();
                this.LLILZIL = C444960Hcc.LIZJ(C894660Z7w.LIZ());
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                GridLayoutManager gridLayoutManager;
                C21681919tJ c21681919tJ;
                int childLayoutPosition = recyclerView2.getChildLayoutPosition(view);
                if (childLayoutPosition < 0) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                    int i5 = gridLayoutManager.LLILLJJLI;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                        int i6 = c21681919tJ.LL;
                        int i7 = c21681919tJ.LLILLJJLI;
                        if (this.LLILLL && i5 != i7) {
                            int i8 = 0;
                            if (childLayoutPosition < i5) {
                                int iLJFF = 0;
                                while (true) {
                                    iLJFF += gridLayoutManager.LLIZ.LJFF(i8);
                                    if (i8 == childLayoutPosition) {
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                                if (iLJFF <= i5) {
                                    rect.top = this.LLILLJJLI;
                                }
                            }
                        }
                        if (i7 == i5) {
                            Integer num2 = this.LLILZ;
                            if (num2 != null) {
                                rect.top = num2.intValue();
                                rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            } else {
                                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            }
                        } else {
                            rect.bottom = this.LLILLJJLI;
                        }
                        int i9 = this.LL;
                        int i10 = (i6 * i9) / i5;
                        int i11 = i9 - (((i6 + i7) * i9) / i5);
                        rect.left = i10;
                        rect.right = i11;
                        if (this.LLILZIL) {
                            rect.left = i11;
                            rect.right = i10;
                        }
                    }
                }
            }
        });
        recyclerView.setAdapter(this);
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        List<C451030HmP> data;
        Object obj;
        if (i < 0 || (data = getData()) == null || (obj = ListProtector.get(data, i)) == null) {
            return 0;
        }
        if (obj instanceof C449640HkA) {
            return 1002;
        }
        return 1001;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJI(new C0IDE(this, gridLayoutManager, 1));
        }
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C451030HmP c451030HmP;
        C450970HmJ c450970HmJ;
        C450980HmK c450980HmK;
        C449640HkA c449640HkA;
        List<C451030HmP> data = getData();
        if (data != null && (c451030HmP = (C451030HmP) C13LP.LJJJLZIJ(i, data)) != null) {
            if (viewHolder instanceof C451000HmM) {
                if ((c451030HmP instanceof C449640HkA) && (c449640HkA = (C449640HkA) c451030HmP) != null) {
                    ((TextView) ((C451000HmM) viewHolder).LL.getChildAt(0)).setText(c449640HkA.LJIIIZ);
                    return;
                }
                return;
            }
            if (viewHolder instanceof C443060HYy) {
                return;
            }
            if (viewHolder instanceof C0HYK) {
                C0HYK c0hyk = (C0HYK) viewHolder;
                Integer num = this.LLJ;
                C786410Ut5.LJLLLLLL(0, c0hyk.LLILLL);
                c0hyk.LLILZ = num;
                return;
            }
            if (viewHolder instanceof C450970HmJ) {
                c450970HmJ = (C450970HmJ) viewHolder;
            } else {
                c450970HmJ = null;
            }
            if (!(c450970HmJ instanceof C450980HmK) || (c450980HmK = (C450980HmK) c450970HmJ) == null) {
                return;
            }
            View view = c450980HmK.itemView;
            StickerGridAdapter stickerGridAdapter = c450980HmK.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                int i2 = stickerGridAdapter.LLJILJIL.LIZ;
                layoutParams.width = i2;
                layoutParams.height = i2;
                C786410Ut5.W5(view, layoutParams);
                AwS133S0201000_6 awS133S0201000_6 = new AwS133S0201000_6(c450980HmK.LLILLJJLI, i, c450980HmK, 3);
                c450980HmK.getClass();
                awS133S0201000_6.invoke();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    @Override // X.AbstractC450910HmD, X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        RecyclerView.LayoutManager layoutManager;
        if (C270150AiL.LIZ()) {
            int iLIZIZ = C497820Jfg.LIZIZ(C1383370m6R.LIZ);
            int i = this.LLJIJIL;
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            if (iMHostApiLIZ != null) {
                iMHostApiLIZ.LIZ();
            }
            this.LLJILJIL = C450990HmL.LIZ(iLIZIZ, i);
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            ((GridLayoutManager) layoutManager).LJIJ(this.LLJILJIL.LIZJ);
            notifyDataSetChanged();
        }
        super.onConfigurationChanged(activity, configuration);
    }

    @Override // X.AbstractC450910HmD, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1002:
                LinearLayout linearLayout = new LinearLayout(this.LL);
                TuxTextView tuxTextView = new TuxTextView(this.LL, null, 6, 0);
                tuxTextView.setTuxFont(51);
                tuxTextView.setTextColorRes(R.attr.a1k);
                linearLayout.addView(tuxTextView);
                linearLayout.setGravity(8388611);
                return new C451000HmM(linearLayout);
            case 1003:
                return new C443060HYy(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c3j, viewGroup, false), LLLI());
            case 1004:
                return new C0HYK(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c3k, viewGroup, false), LLLI());
            default:
                return new C450980HmK(this, C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c3l, viewGroup, false));
        }
    }

    public StickerGridAdapter(LifecycleOwner lifecycleOwner, Context context, int i, Integer num, Integer num2, AwS585S0100000_6 awS585S0100000_6) {
        super(context, lifecycleOwner);
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = context;
        this.LLIZ = i;
        this.LLIZLLLIL = num;
        this.LLJ = num2;
        this.LLJI = awS585S0100000_6;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        this.LLJIJIL = iLIZIZ;
        int iLIZIZ2 = C497820Jfg.LIZIZ(C1383370m6R.LIZ);
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            iMHostApiLIZ.LIZ();
        }
        this.LLJILJIL = C450990HmL.LIZ(iLIZIZ2, iLIZIZ);
    }
}
