package com.ss.android.ugc.aweme.im.sdk.chat.ui.comment;

import X.C01GW;
import X.C0I3V;
import X.C0I4H;
import X.C0I4Y;
import X.C0I6E;
import X.C0ZQZ;
import X.C0ZZD;
import X.C0ZZG;
import X.C0ZZH;
import X.C0ZZI;
import X.C0ZZJ;
import X.C0ZZK;
import X.C0ZZL;
import X.C0ZZM;
import X.C0ZZN;
import X.C0ZZO;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1332130kln;
import X.C1383370m6R;
import X.C1559260qg8;
import X.C1954807lC;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C438710HIf;
import X.C452501pT;
import X.C454440Hru;
import X.C461530I7z;
import X.C461640I8k;
import X.C462590ICb;
import X.C498330JgV;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C814420VxA;
import X.C898900ZOe;
import X.EnumC714850S2h;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareCommentReusedUISlot extends ReusedUISlotAssem<ShareCommentReusedUISlot> implements InterfaceC712990Rxx<C0ZZJ>, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 820));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 817));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 818));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 819));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 821));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 822));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 824));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 823));
    public final C1559260qg8 LLJZIJLIL = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cly;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final View yp() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iMin = Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C461640I8k.LIZJ(C461640I8k.LIZ, view.getContext(), ((C898900ZOe) this.LLJZIJLIL.getValue()).LLILLL, 0.0f, 0.0f, 124));
        View viewYp = yp();
        ViewGroup.LayoutParams layoutParams = viewYp.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iMin;
            C786410Ut5.W5(viewYp, layoutParams);
            int iLIZIZ = iMin - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            ((TextView) this.LLJL.getValue()).setMaxWidth(iLIZIZ);
            ((TextView) this.LLJLILLLLZIIL.getValue()).setMaxWidth(iLIZIZ);
            View view2 = (View) this.LLJLIL.getValue();
            Context context = C1383370m6R.LIZ;
            view2.setForeground(new StateListDrawable());
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 35), yp());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void sp(C0ZZM c0zzm) {
        if (c0zzm instanceof C0ZZO) {
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJLILLLLZIIL.getValue(), 8);
            return;
        }
        if (c0zzm instanceof C0ZZH) {
            TuxTextView tuxTextView = (TuxTextView) this.LLJLILLLLZIIL.getValue();
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            C0ZZH c0zzh = (C0ZZH) c0zzm;
            tuxTextView.setText(c0zzh.LIZ);
            tuxTextView.setMaxLines(c0zzh.LIZIZ);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            C426750GoL.LJIIIZ((View) this.LLJLILLLLZIIL.getValue(), null, null, null, Integer.valueOf(c0zzh.LIZJ), false, 23);
            return;
        }
        throw new C1954807lC();
    }

    public final void tp(C0ZZL c0zzl) {
        int i = 8;
        if (c0zzl instanceof C0ZZN) {
            C786410Ut5.LJZ(8, (FrameLayout) this.LLJLL.getValue());
            return;
        }
        if (c0zzl instanceof C0ZZG) {
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJLL.getValue());
            TuxIconView tuxIconView = (TuxIconView) this.LLJLLL.getValue();
            C0ZZG c0zzg = (C0ZZG) c0zzl;
            if (c0zzg.LIZIZ) {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0zzg.LIZ));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(4);
            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LIZLLL = true;
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJLLIL.getValue());
            C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "ShareCommentCard", null, false, null, null, null, 62);
            C426750GoL.LJIIIZ((View) this.LLJLL.getValue(), null, null, null, Integer.valueOf(c0zzg.LIZJ), false, 23);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0ZZJ c0zzj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public final void up(C0ZZJ c0zzj) {
        op(LJJIJL().getContext(), c0zzj.getContent().LIZ);
        sp(c0zzj.getContent().LIZIZ);
        tp(c0zzj.getContent().LIZJ);
        up(LJJIJL().getContext(), c0zzj.getContent().LIZLLL);
        yp().setBackground(C462590ICb.LIZIZ(c0zzj.LIZJ(), LJJIJL()));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0ZZJ c0zzj) {
    }

    public final void op(Context context, C0ZZI c0zzi) {
        String str = c0zzi.LIZIZ;
        ((TextView) this.LLJL.getValue()).setText(context.getString(2131835525, str));
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0zzi.LIZ));
        c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
        c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.c5w);
        c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJLIL.getValue());
        C1332130kln.LJ(c1331670kl3LJIIIIZZ, "ShareCommentAvatarView", str, 0, false, new C0I6E(str), null, 220);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C0ZZK c0zzk;
        C0ZZJ c0zzj = (C0ZZJ) interfaceC1587906Jp;
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
                if ((obj2 instanceof C0ZZK) && (c0zzk = (C0ZZK) obj2) != null) {
                    if (c0zzk.LIZ) {
                        op(LJJIJL().getContext(), c0zzj.getContent().LIZ);
                    }
                    if (c0zzk.LIZIZ) {
                        sp(c0zzj.getContent().LIZIZ);
                    }
                    if (c0zzk.LIZJ) {
                        tp(c0zzj.getContent().LIZJ);
                    }
                    if (c0zzk.LIZLLL) {
                        up(LJJIJL().getContext(), c0zzj.getContent().LIZLLL);
                    }
                    if (c0zzk.LJ) {
                        yp().setBackground(C462590ICb.LIZIZ(c0zzj.LIZJ(), LJJIJL()));
                    }
                }
            }
            return;
        }
        up(c0zzj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void up(Context context, C0ZZD c0zzd) {
        String quantityString;
        if ((c0zzd.LIZIZ instanceof C0I4H) && (c0zzd.LIZ instanceof C0I4H)) {
            ((C0ZQZ) this.LLJZ.getValue()).LIZIZ();
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) ((C0ZQZ) this.LLJZ.getValue()).LIZ();
        if (tuxTextView == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C0I4Y<Integer> c0i4y = c0zzd.LIZ;
        C0I4Y<Long> c0i4y2 = c0zzd.LIZIZ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = c0i4y instanceof C0I3V;
        String quantityString2 = "";
        if (!z) {
            quantityString = "";
        } else {
            quantityString = context.getResources().getQuantityString(2131755229, ((Number) ((C0I3V) c0i4y).LIZ).intValue(), C498330JgV.LIZ(((Number) r3.LIZ).intValue()));
        }
        boolean z2 = c0i4y2 instanceof C0I3V;
        if (z2) {
            C0I3V c0i3v = (C0I3V) c0i4y2;
            quantityString2 = context.getResources().getQuantityString(2131755228, (int) ((Number) c0i3v.LIZ).longValue(), C498330JgV.LIZ(((Number) c0i3v.LIZ).longValue()));
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) quantityString);
            if (z2) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                c419910GdJ.LIZ = R.raw.icon_ellipsis_single;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                C419890GdH c419890GdH = new C419890GdH(c419910GdJ.LIZ(context), 2);
                c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C426750GoL.LIZLLL(context));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " ");
                C786410Ut5.q2(spannableStringBuilder, c419890GdH, length, length + 1, 33);
                spannableStringBuilder.append((CharSequence) quantityString2);
            }
        } else if (z2) {
            spannableStringBuilder.append((CharSequence) quantityString2);
        }
        tuxTextView.setText(new SpannableString(spannableStringBuilder));
    }
}
