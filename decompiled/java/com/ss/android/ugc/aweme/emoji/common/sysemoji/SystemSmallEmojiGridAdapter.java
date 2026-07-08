package com.ss.android.ugc.aweme.emoji.common.sysemoji;

import X.AbstractC450910HmD;
import X.C0H3O;
import X.C0H3S;
import X.C117T;
import X.C12ES;
import X.C1388190mED;
import X.C21673919s1;
import X.C450550Hld;
import X.C450880HmA;
import X.C450920HmE;
import X.C450970HmJ;
import X.C451030HmP;
import X.C786410Ut5;
import X.InterfaceC21676019sM;
import Y.ACListenerS110S0200000_6;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS13S0201000_6;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SystemSmallEmojiGridAdapter extends AbstractC450910HmD<C451030HmP> implements C0H3S {
    public final LifecycleOwner LLILZIL;
    public final C450550Hld LLILZLL;
    public final C117T LLIZ;
    public final C450880HmA LLIZLLLIL;
    public final Function1<C21673919s1, Unit> LLJ;
    public int LLJI;
    public final int LLJIJIL;

    @Override // X.AbstractC450910HmD
    public final int LLLII() {
        return R.layout.c3q;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC450910HmD
    public final int LLLIILIL() {
        View view;
        RecyclerView recyclerView = this.LLILLL;
        Object parent = recyclerView != null ? recyclerView.getParent() : null;
        return LLLFZ((!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? 0 : view.getWidth(), this.LLJIJIL, this.LLJI, this.LLILLJJLI);
    }

    @Override // X.AbstractC450910HmD
    public final void LLLIIIIL(RecyclerView recyclerView) {
        final int iLJIIJ;
        super.LLLIIIIL(recyclerView);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        C450880HmA c450880HmA = this.LLIZLLLIL;
        if (c450880HmA != null) {
            Integer numValueOf = Integer.valueOf(c450880HmA.LIZIZ);
            if (numValueOf.intValue() > 0) {
                this.LLJI = numValueOf.intValue();
            }
        }
        int i = this.LLJI;
        marginLayoutParams.setMargins(i, 0, i, 0);
        C450880HmA c450880HmA2 = this.LLIZLLLIL;
        if (c450880HmA2 != null && c450880HmA2.LIZ) {
            int i2 = c450880HmA2.LIZJ;
            iLJIIJ = (int) (((((double) C12ES.LJIIJ(this.LL)) - (((double) this.LLJI) * 2.0d)) + ((double) i2)) / ((double) (i2 + this.LLJIJIL)));
        } else {
            iLJIIJ = this.LLILLJJLI;
        }
        final Context context = this.LL;
        recyclerView.setLayoutManager(new WrapGridLayoutManager(iLJIIJ, context) { // from class: com.ss.android.ugc.aweme.emoji.common.sysemoji.SystemSmallEmojiGridAdapter$setup$lm$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                super.onLayoutCompleted(c21673919s1);
                this.LLJ.invoke(c21673919s1);
            }
        });
        C786410Ut5.LLIZLLLIL(recyclerView, 4);
        HandlerHook.viewPost(recyclerView, new ARunnableS13S0201000_6(this, iLJIIJ, (C450550Hld) recyclerView, 5));
        recyclerView.setAdapter(this);
        recyclerView.setItemViewCacheSize(14);
        recyclerView.setHasFixedSize(true);
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<C451030HmP> list) {
        super.setData(list);
        Activity activityLIZ = C1388190mED.LIZ(this.LLILZLL.getContext());
        if (activityLIZ == null) {
            return;
        }
        final C0H3O c0h3o = new C0H3O(activityLIZ, this.LLILZLL);
        c0h3o.LLILZ = this;
        final List<C451030HmP> data = getData();
        if (data != null) {
            C450550Hld c450550Hld = this.LLILZLL;
            final C117T c117t = this.LLIZ;
            final int i = this.LLJIJIL;
            c450550Hld.addOnItemTouchListener(new InterfaceC21676019sM(c0h3o, c117t, data, i) { // from class: X.0H3i
                public final C0H3O LL;
                public final C117T LLILLJJLI;
                public final List<C451030HmP> LLILLL;
                public long LLILZ;
                public int LLILZIL = -1;
                public float LLILZLL = -1.0f;
                public float LLIZ = -1.0f;
                public final float LLIZLLLIL;
                public boolean LLJ;

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                public final void LIZ(C117T c117t2) {
                    Context context = c117t2.getContext();
                    while (!(context instanceof Activity)) {
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            return;
                        }
                    }
                    if (context != null) {
                        c117t2.setSwipeEnabled(true);
                        this.LLILZIL = -1;
                    }
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3 && this.LL.isShowing()) {
                                LIZ(this.LLILLJJLI);
                                this.LL.dismiss();
                                return;
                            }
                            return;
                        }
                        if (!this.LL.isShowing()) {
                            return;
                        }
                        this.LL.LJJIIJZLJL((ImSysEmojiModel) ((C451030HmP) ListProtector.get(this.LLILLL, this.LLILZIL)).LIZJ, motionEvent, null);
                        return;
                    }
                    if (!this.LL.isShowing()) {
                        return;
                    }
                    this.LL.LJJIIJZLJL((ImSysEmojiModel) ((C451030HmP) ListProtector.get(this.LLILLL, this.LLILZIL)).LIZJ, motionEvent, null);
                    LIZ(this.LLILLJJLI);
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    View viewFindChildViewUnder;
                    int absoluteAdapterPosition;
                    int i2;
                    if (!(recyclerView instanceof C450550Hld) || (viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                        return false;
                    }
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(viewFindChildViewUnder);
                    if (!(childViewHolder instanceof C450920HmE) || (absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition()) == -1) {
                        return false;
                    }
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                if (action == 3 && this.LL.isShowing()) {
                                    LIZ(this.LLILLJJLI);
                                    this.LL.dismiss();
                                }
                            } else {
                                if (Math.abs(motionEvent.getRawX() - this.LLILZLL) > this.LLIZLLLIL || Math.abs(motionEvent.getRawY() - this.LLIZ) > this.LLIZLLLIL) {
                                    this.LLJ = true;
                                }
                                if (this.LLJ) {
                                    return false;
                                }
                                int i3 = this.LLILZIL;
                                if (i3 != absoluteAdapterPosition) {
                                    this.LLILZIL = -1;
                                    return false;
                                }
                                if (i3 != -1 && this.LLILZ != 0 && System.currentTimeMillis() - this.LLILZ > 150 && !this.LL.isShowing() && this.LLILZIL == absoluteAdapterPosition) {
                                    viewFindChildViewUnder.performHapticFeedback(0);
                                    if (absoluteAdapterPosition <= this.LLILLL.size()) {
                                        this.LL.LJJIIJZLJL((ImSysEmojiModel) ((C451030HmP) ListProtector.get(this.LLILLL, absoluteAdapterPosition)).LIZJ, motionEvent, viewFindChildViewUnder);
                                    }
                                    C0H3O c0h3o2 = this.LL;
                                    View contentView = c0h3o2.getContentView();
                                    int width = c0h3o2.getWidth();
                                    int i4 = 1073741824;
                                    if (width == -2) {
                                        i2 = 0;
                                    } else {
                                        i2 = 1073741824;
                                    }
                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), i2);
                                    int height = c0h3o2.getHeight();
                                    if (height == -2) {
                                        i4 = 0;
                                    }
                                    contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), i4));
                                    this.LL.LJJIIJ(viewFindChildViewUnder);
                                    this.LLILLJJLI.setSwipeEnabled(false);
                                    return true;
                                }
                            }
                            return false;
                        }
                        LIZ(this.LLILLJJLI);
                        return false;
                    }
                    this.LLILZLL = motionEvent.getRawX();
                    this.LLIZ = motionEvent.getRawY();
                    this.LLILZ = System.currentTimeMillis();
                    this.LLILZIL = absoluteAdapterPosition;
                    this.LLJ = false;
                    return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = c0h3o;
                    this.LLILLJJLI = c117t;
                    this.LLILLL = data;
                    this.LLIZLLLIL = i / 2.0f;
                }
            });
        }
    }

    @Override // X.C0H3S
    public final void LJLIL(ImSysEmojiModel imSysEmojiModel, String str) {
        imSysEmojiModel.getPosition();
        List<C451030HmP> data = getData();
        if (data == null) {
            return;
        }
        ((ImSysEmojiModel) ((C451030HmP) ListProtector.get(data, imSysEmojiModel.getPosition())).LIZJ).setPreviewEmoji(str);
        LLLI().LJI(str);
        notifyItemChanged(imSysEmojiModel.getPosition());
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C450970HmJ c450970HmJ;
        if (viewHolder instanceof C450970HmJ) {
            c450970HmJ = (C450970HmJ) viewHolder;
        } else {
            c450970HmJ = null;
        }
        List<C451030HmP> data = getData();
        if (data != null && (!data.isEmpty()) && c450970HmJ != null) {
            C451030HmP c451030HmP = (C451030HmP) ListProtector.get(data, i);
            C450920HmE c450920HmE = (C450920HmE) c450970HmJ;
            if (!TextUtils.isEmpty(c451030HmP.LIZIZ)) {
                if (c450920HmE.LLILLJJLI != null) {
                    ImSysEmojiModel imSysEmojiModel = (ImSysEmojiModel) c451030HmP.LIZJ;
                    imSysEmojiModel.setPosition(i);
                    c450920HmE.LLILLJJLI.setText(imSysEmojiModel.getPreviewEmoji());
                    c450920HmE.LLILLJJLI.setContentDescription(c451030HmP.LIZIZ);
                } else {
                    return;
                }
            }
            TextView textView = c450920HmE.LLILLJJLI;
            if (textView != null) {
                HandlerHook.viewPost(textView, new ARunnableS106S0100000_6(c450970HmJ, 56));
            }
            View view = c450970HmJ.itemView;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS110S0200000_6(c451030HmP, this, 22), view);
            }
        }
    }

    @Override // X.AbstractC450910HmD, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        return new C450920HmE(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.c3q, viewGroup, false));
    }

    public SystemSmallEmojiGridAdapter(LifecycleOwner lifecycleOwner, C450550Hld c450550Hld, C117T c117t, C450880HmA c450880HmA, AwS585S0100000_6 awS585S0100000_6) {
        int iLIZJ;
        Integer num;
        super(c450550Hld.getContext(), lifecycleOwner);
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = c450550Hld;
        this.LLIZ = c117t;
        this.LLIZLLLIL = c450880HmA;
        this.LLJ = awS585S0100000_6;
        this.LLJI = (int) C12ES.LIZJ(14.0f, this.LL);
        C12ES.LIZJ(24.0f, this.LL);
        if (c450880HmA != null && (num = c450880HmA.LIZLLL) != null) {
            iLIZJ = num.intValue();
        } else {
            iLIZJ = (int) C12ES.LIZJ(29.0f, this.LL);
        }
        this.LLJIJIL = iLIZJ;
    }
}
