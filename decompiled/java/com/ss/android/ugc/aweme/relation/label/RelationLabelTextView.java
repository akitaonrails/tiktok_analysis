package com.ss.android.ugc.aweme.relation.label;

import X.C01GW;
import X.C04TD;
import X.C10KI;
import X.C10KJ;
import X.C10KK;
import X.C1153800g8A;
import X.C11JF;
import X.C11S5;
import X.C1264000izu;
import X.C1264010izv;
import X.C1264020izw;
import X.C1701940uOG;
import X.C19334110kV;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C431260Gvc;
import X.C452501pT;
import X.EnumC1264040izy;
import X.InterfaceC781210Ukh;
import X.ViewOnLayoutChangeListenerC19332110kB;
import Y.AfS162S0200000_28;
import Y.AfS49S1200000_28;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class RelationLabelTextView extends TuxTextView {
    public static final String LLLFF = u.LJJ(100, new StringBuilder(" "));
    public Function1<? super Integer, Unit> LLJJJJ;
    public C11JF LLJJJJJIL;
    public SpannableStringBuilder LLJJJJLIIL;
    public float LLJJL;
    public C1264020izw LLJJLIIIJLLLLLLLZ;
    public C10KJ LLJL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public final C01GW LLLF;

    public RelationLabelTextView(Context context) {
        this(context, null, 6);
    }

    public RelationLabelTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getViewId() {
        return ((Number) this.LLLF.getValue()).intValue();
    }

    public final void LJJJLIIL() {
        EnumC1264040izy enumC1264040izy;
        long jNanoTime = System.nanoTime();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(this.LLJLILLLLZIIL - this.LLJLIL, "translation_time");
        c2344009Gk.LIZLLL(this.LLJLL - this.LLJLILLLLZIIL, "detect_size_time");
        c2344009Gk.LIZLLL(jNanoTime - this.LLJLL, "real_bind_time");
        c2344009Gk.LIZLLL(this.LLJLLIL - this.LLJLIL, "invisible_time");
        c2344009Gk.LIZLLL(this.LLJLLIL - this.LLJLL, "text_build_time");
        c2344009Gk.LIZLLL(jNanoTime - this.LLJLIL, "total_bind_time");
        c2344009Gk.LJ(Boolean.valueOf(this.LLJLLL), "hit_cache");
        c2344009Gk.LJ(Boolean.valueOf(this.LLJZ), "detect_size");
        C1264020izw c1264020izw = this.LLJJLIIIJLLLLLLLZ;
        c2344009Gk.LJ(Boolean.valueOf((c1264020izw == null || c1264020izw.LIZIZ == null) ? false : true), "has_tail");
        c2344009Gk.LJIIIIZZ("rec_type", this.LLJZIJLIL);
        c2344009Gk.LIZJ(C10KI.LIZIZ.LJI(), "cache_overload");
        C10KJ c10kj = this.LLJL;
        c2344009Gk.LJ((c10kj == null || (enumC1264040izy = c10kj.LIZ) == null) ? null : Integer.valueOf(enumC1264040izy.ordinal()), "config_ext_style");
        C10KJ c10kj2 = this.LLJL;
        c2344009Gk.LJ(c10kj2 != null ? Boolean.valueOf(c10kj2.LIZIZ) : null, "config_tail_avatar");
        C10KJ c10kj3 = this.LLJL;
        c2344009Gk.LJ(c10kj3 != null ? Boolean.valueOf(c10kj3.LIZJ) : null, "config_avatar_next_line");
        C10KJ c10kj4 = this.LLJL;
        c2344009Gk.LJ(c10kj4 != null ? Boolean.valueOf(c10kj4.LIZLLL) : null, "config_name_bold");
        C10KJ c10kj5 = this.LLJL;
        c2344009Gk.LJ(c10kj5 != null ? Boolean.valueOf(c10kj5.LJ) : null, "config_name_clickable");
        C10KJ c10kj6 = this.LLJL;
        c2344009Gk.LJ(c10kj6 != null ? c10kj6.LJFF : null, "config_ellipsis_strategy");
        C10KJ c10kj7 = this.LLJL;
        c2344009Gk.LJ(c10kj7 != null ? Boolean.valueOf(c10kj7.LJII) : null, "config_cacheable");
        C10KJ c10kj8 = this.LLJL;
        c2344009Gk.LJ(c10kj8 != null ? Boolean.valueOf(c10kj8.LJI) : null, "config_fix_width");
        c2344009Gk.LJIIIIZZ("bind_result", this.LLL);
        C20684815ws.LJIILLIIL("relation_label_bind", c2344009Gk.LIZ);
    }

    public final void setClickHandler(Function1<? super Integer, Unit> function1) {
        this.LLJJJJ = function1;
    }

    public RelationLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJLIL = Long.MAX_VALUE;
        this.LLJLILLLLZIIL = Long.MAX_VALUE;
        this.LLJLL = Long.MAX_VALUE;
        this.LLJZIJLIL = "";
        this.LLL = "success";
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1735));
    }

    public static void LJJJJL(RelationLabelTextView relationLabelTextView, MatchedFriendStruct matchedFriendStruct, C10KJ c10kj) {
        relationLabelTextView.LJJJJJ(matchedFriendStruct, c10kj, AFwS217S0000000_28.get$arr$(746));
    }

    public final void LJJJJJ(MatchedFriendStruct matchedFriendStruct, C10KJ c10kj, Function0<Unit> function0) {
        String str;
        C1264020izw c1264020izwLIZIZ;
        this.LLJLIL = System.nanoTime();
        if (matchedFriendStruct == null || (str = matchedFriendStruct.recType) == null) {
            str = "";
        }
        this.LLJZIJLIL = str;
        C11JF c11jf = this.LLJJJJJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJJJJIL = null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BIND [");
        sbLIZ.append(getViewId());
        sbLIZ.append("][");
        sbLIZ.append(this.LLJZIJLIL);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (matchedFriendStruct != null) {
            c1264020izwLIZIZ = C1264000izu.LIZJ(matchedFriendStruct, c10kj);
        } else {
            C1264010izv.LIZ.getClass();
            c1264020izwLIZIZ = C1264010izv.LIZIZ(null);
        }
        this.LLJLILLLLZIIL = System.nanoTime();
        if (c10kj.LJI && this.LLJJL != 0.0f) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(getViewId());
            sbLIZ2.append(" skip detect");
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LLJZ = false;
            LJJJJLI(c1264020izwLIZIZ, c10kj, this.LLJJL, function0);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(getViewId());
        sbLIZ3.append(" need detect fixWidth is ");
        sbLIZ3.append(c10kj.LJI);
        sbLIZ3.append(" and tvWidth is ");
        sbLIZ3.append(this.LLJJL);
        C2188811AlT.LIZIZ(sbLIZ3);
        this.LLJZ = true;
        setText(LLLFF);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19332110kB(this, c1264020izwLIZIZ, c10kj, function0, 1));
    }

    public final void LJJJJLI(final C1264020izw c1264020izw, final C10KJ c10kj, final float f, final Function0<Unit> function0) {
        String str;
        this.LLJLL = System.nanoTime();
        this.LLJL = c10kj;
        this.LLJJLIIIJLLLLLLLZ = c1264020izw;
        this.LLJLLIL = 0L;
        this.LLL = "success";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(getViewId());
        sbLIZ.append("]BIND width:[");
        sbLIZ.append(f);
        sbLIZ.append("] text:[");
        C1153800g8A c1153800g8A = c1264020izw.LIZ;
        if (c1153800g8A != null) {
            str = c1153800g8A.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (c10kj.LJ) {
            setMovementMethod(C431260Gvc.LIZ);
            setHighlightColor(0);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1264020izw.hashCode());
        sbLIZ2.append('|');
        sbLIZ2.append(c10kj.hashCode());
        sbLIZ2.append('|');
        sbLIZ2.append(getTextSize());
        sbLIZ2.append('|');
        sbLIZ2.append(getMaxLines());
        sbLIZ2.append('|');
        sbLIZ2.append(f);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LLJZ) {
            HandlerHook.viewPost(this, new Runnable() { // from class: X.10KG
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RelationLabelTextView@f9a7.bindActual$1");
                    try {
                        this.LL.LJJJJLL(c1264020izw, c10kj, f, strLIZIZ);
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RelationLabelTextView@f9a7.bindActual$1");
                }
            });
        } else {
            LJJJJLL(c1264020izw, c10kj, f, strLIZIZ);
        }
    }

    public final void LJJJJLL(final C1264020izw c1264020izw, final C10KJ c10kj, float f, final String str) {
        IRelationLabelTextViewService iRelationLabelTextViewService;
        CharSequence charSequence;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("paint start: viewId is ");
        sbLIZ.append(getViewId());
        sbLIZ.append(", key is ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c10kj.LJII && (charSequence = (SpannableStringBuilder) C10KI.LIZIZ.LIZJ(str)) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(getViewId());
            sbLIZ2.append(" set cache text ");
            sbLIZ2.append((Object) charSequence);
            C2188811AlT.LIZIZ(sbLIZ2);
            setText(charSequence);
            this.LLJLLL = true;
            this.LLJLLIL = System.nanoTime();
            LJJJLIIL();
            return;
        }
        this.LLJLLL = false;
        Object objLIZ = C04TD.LIZ(IRelationLabelTextViewService.class, false);
        if (objLIZ != null) {
            iRelationLabelTextViewService = (IRelationLabelTextViewService) objLIZ;
        } else {
            if (C04TD.z3 == null) {
                synchronized (IRelationLabelTextViewService.class) {
                    if (C04TD.z3 == null) {
                        C04TD.z3 = new RelationLabelTextViewServiceImpl();
                    }
                }
            }
            iRelationLabelTextViewService = C04TD.z3;
        }
        C10KK c10kkLIZ = iRelationLabelTextViewService.LIZ(c1264020izw, c10kj, this, f);
        c10kkLIZ.LJIIIIZZ = this.LLJJJJ;
        SpannableStringBuilder spannableStringBuilderLIZLLL = c10kkLIZ.LIZLLL();
        this.LLJJJJLIIL = spannableStringBuilderLIZLLL;
        setText(spannableStringBuilderLIZLLL);
        this.LLJLLIL = System.nanoTime();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(getViewId());
        sbLIZ3.append(" set initial text ");
        sbLIZ3.append((Object) this.LLJJJJLIIL);
        C2188811AlT.LIZIZ(sbLIZ3);
        this.LLJJJJJIL = (C11JF) c10kkLIZ.LJIIIIZZ().LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJL(new C19334110kV(this, 3)).LJJZ(new AfS162S0200000_28(this, (MutableLiveData<Integer>) c10kj, (Function0<Unit>) 9), new AfS49S1200000_28(this, str, c1264020izw, 0), new InterfaceC781210Ukh() { // from class: X.10KH
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                RelationLabelTextView relationLabelTextView;
                SpannableStringBuilder spannableStringBuilder;
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(this.LIZ.getViewId());
                sbLIZ4.append(" complete");
                C2188811AlT.LIZIZ(sbLIZ4);
                if (!c10kj.LJII || (spannableStringBuilder = (relationLabelTextView = this.LIZ).LLJJJJLIIL) == null) {
                    return;
                }
                String str2 = str;
                C1264020izw c1264020izw2 = c1264020izw;
                synchronized (C10KI.LIZ) {
                    C10KI.LIZIZ.LIZLLL(str2, spannableStringBuilder);
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("CACHE STORE [");
                sbLIZ5.append(str2);
                sbLIZ5.append("] [");
                C1153800g8A c1153800g8A = c1264020izw2.LIZ;
                sbLIZ5.append(c1153800g8A != null ? c1153800g8A.LIZ : null);
                sbLIZ5.append("] [");
                sbLIZ5.append(relationLabelTextView.getViewId());
                sbLIZ5.append(']');
                C2188811AlT.LIZIZ(sbLIZ5);
            }
        });
    }
}
