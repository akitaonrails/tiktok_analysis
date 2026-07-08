package poa;

import X.AbstractC2172971A2l;
import X.AbstractC339510DSr;
import X.C01GW;
import X.C03E9;
import X.C03XA;
import X.C0H1U;
import X.C1308910kAL;
import X.C1756510voH;
import X.C1AF0;
import X.C20612085q;
import X.C2081408Dk;
import X.C2344809Gs;
import X.C452501pT;
import X.C786410Ut5;
import X.C946803n0;
import X.C960203pA;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.ImageRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;
import rla.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends AbstractC2172971A2l<UserTrustItemDescriptionChunk, C03E9> implements c {
    public List<UserTrustItemDescriptionChunk> LLILLJJLI;
    public final int LLILLL;
    public final Function1<? super LinkText, Unit> LLILZ;
    public final C01GW LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public Float LLJ;

    @Override // p8b.c
    public final String getViewName() {
        return "UserTrustItemAdapter";
    }

    @Override // X.AbstractC2172971A2l, X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iLIZ;
        SpannableStringBuilder spannableStringBuilderLJ;
        String str;
        C03E9 c03e9 = (C03E9) viewHolder;
        UserTrustItemDescriptionChunk userTrustItemDescriptionChunk = (UserTrustItemDescriptionChunk) ListProtector.get(this.LLILLJJLI, i);
        Integer num = userTrustItemDescriptionChunk.type;
        String str2 = null;
        int iIntValue = 0;
        if (num != null) {
            if (num.intValue() == 1) {
                C786410Ut5.LL(0, c03e9.LL);
                C786410Ut5.LL(8, c03e9.LLILLL);
                Context context = c03e9.itemView.getContext();
                try {
                    LinkRichText linkRichText = userTrustItemDescriptionChunk.textWithLink;
                    if (linkRichText != null && (str = linkRichText.textColor) != null) {
                        iLIZ = Color.parseColor(str);
                    } else {
                        iLIZ = C960203pA.LIZ(this.LLILLL, context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    iLIZ = C960203pA.LIZ(this.LLILLL, context);
                }
                TuxTextView tuxTextView = c03e9.LLILLJJLI;
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setClickable(true);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                LinkRichText linkRichText2 = userTrustItemDescriptionChunk.textWithLink;
                if (linkRichText2 != null) {
                    RichTextUtil richTextUtil = RichTextUtil.LIZ;
                    Context context2 = tuxTextView.getContext();
                    Integer numValueOf = Integer.valueOf(iLIZ);
                    String str3 = this.LLILZLL;
                    if (str3 == null) {
                        str3 = "normal_checkout";
                    }
                    spannableStringBuilderLJ = RichTextUtil.LJ(richTextUtil, context2, linkRichText2, numValueOf, 0, false, null, null, str3, this.LLIZ, this.LLIZLLLIL, false, this.LLJ, null, new AwS580S0100000_1(this, 800), 5240);
                } else {
                    spannableStringBuilderLJ = null;
                }
                tuxTextView.setText(spannableStringBuilderLJ);
                Integer numLIZJ = C1308910kAL.LIZJ(this.LLILLL, tuxTextView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                tuxTextView.setTextColor(iIntValue);
                tuxTextView.setTuxFont(((b) this.LLILZIL.getValue()).LLILL());
                C1756510voH.LIZ(tuxTextView, null);
                return;
            }
            if (num.intValue() == 2) {
                C786410Ut5.LL(0, c03e9.LL);
                C786410Ut5.LLLLZLL(c03e9.LLILLJJLI, 8);
                C786410Ut5.LL(0, c03e9.LLILLL);
                TuxTextView tuxTextView2 = c03e9.LLILZ;
                ImageRichText imageRichText = userTrustItemDescriptionChunk.textWithImage;
                if (imageRichText != null) {
                    str2 = imageRichText.text;
                }
                C0H1U.LJIIL(tuxTextView2, str2, true);
                TuxTextView tuxTextView3 = c03e9.LLILZ;
                Integer numLIZJ2 = C1308910kAL.LIZJ(this.LLILLL, c03e9.itemView.getContext());
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                }
                tuxTextView3.setTextColor(iIntValue);
                c03e9.LLILZIL.setGravity(-1);
                AwS245S0300000_1 awS245S0300000_1 = new AwS245S0300000_1(c03e9, userTrustItemDescriptionChunk, this, 38);
                if (c03e9.LLILZIL.getWidth() == 0) {
                    HandlerHook.viewPost(c03e9.LLILZIL, new ARunnableS101S0100000_1(awS245S0300000_1, 64));
                    return;
                } else {
                    awS245S0300000_1.invoke();
                    return;
                }
            }
        }
        C786410Ut5.LL(0, c03e9.LL);
        C786410Ut5.LLLLZLL(c03e9.LLILLJJLI, 8);
        C786410Ut5.LL(0, c03e9.LLILLL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        C03E9 c03e9 = new C03E9(C03XA.LIZJ(context, R.layout.amz, viewGroup, false));
        try {
            View view = c03e9.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03e9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03e9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03E9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03e9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03e9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03E9.class.getName();
        return c03e9;
    }

    public a0(List<UserTrustItemDescriptionChunk> list, int i, Function1<? super LinkText, Unit> function1) {
        super(new AbstractC339510DSr<UserTrustItemDescriptionChunk>() { // from class: X.039v
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(UserTrustItemDescriptionChunk userTrustItemDescriptionChunk, UserTrustItemDescriptionChunk userTrustItemDescriptionChunk2) {
                return Intrinsics.LJFF(userTrustItemDescriptionChunk, userTrustItemDescriptionChunk2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(UserTrustItemDescriptionChunk userTrustItemDescriptionChunk, UserTrustItemDescriptionChunk userTrustItemDescriptionChunk2) {
                return Intrinsics.LJFF(UserTrustItemDescriptionChunk.class, UserTrustItemDescriptionChunk.class);
            }
        });
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = function1;
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1671));
        this.LLILZLL = "normal_checkout";
    }

    public static void LLLIIIIL(a0 a0Var, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            str = "normal_checkout";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        a0Var.LLILZLL = str;
        a0Var.LLIZLLLIL = z;
        a0Var.LLIZ = null;
        a0Var.LLJ = null;
    }
}
