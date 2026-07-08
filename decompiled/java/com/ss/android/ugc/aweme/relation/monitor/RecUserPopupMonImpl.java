package com.ss.android.ugc.aweme.relation.monitor;

import X.AbstractC1261460ivo;
import X.AbstractC1563960qni;
import X.AbstractC1623806Xk;
import X.C0XHY;
import X.C1075800e6M;
import X.C1261270ivV;
import X.C1261350ivd;
import X.C1388190mED;
import X.C13LP;
import X.C1623606Xi;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19EG;
import X.C20620615mW;
import X.C20621515mf;
import X.C20621615mg;
import X.C20621815mi;
import X.C20621915mj;
import X.C20622015mk;
import X.C20622115ml;
import X.C20622215mm;
import X.C491001vg;
import X.C626160OhC;
import X.EnumC20621415me;
import X.EnumC325100Com;
import X.InterfaceC20621715mh;
import Y.AComparatorS43S0000000_24;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class RecUserPopupMonImpl implements InterfaceC20621715mh {
    public final C1261270ivV LL;
    public final EnumC20621415me LLILLJJLI;
    public final Function2<String, JSONObject, Unit> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final List<AbstractC1563960qni> LLILZLL;
    public int LLIZ;

    public RecUserPopupMonImpl() {
        throw null;
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // X.InterfaceC20621715mh
    public final void cancel() {
        this.LLILZIL = true;
        this.LLILZ = false;
        ((ArrayList) this.LLILZLL).clear();
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        C19EG c19egLIZIZ;
        if (abstractC1261460ivo instanceof C1261350ivd) {
            this.LLIZ++;
            if (!(C13LP.LJJLIIIJL(this.LLILZLL) instanceof C20621615mg)) {
                C0XHY.LIZ.getClass();
                Activity topActivity = ActivityStack.getTopActivity();
                String strBQ2 = null;
                if (topActivity != null && (c19egLIZIZ = C1388190mED.LIZIZ(topActivity)) != null) {
                    strBQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).BQ2();
                }
                if (strBQ2 == null) {
                    strBQ2 = "";
                }
                M71(new C20621615mg(strBQ2));
            }
        }
    }

    public final void LIZ(List<? extends AbstractC1563960qni> list) {
        C20621515mf c20621515mf;
        Integer numValueOf;
        String str;
        long jLIZIZ;
        Object next;
        long j;
        long j2;
        long j3;
        EnumC325100Com enumC325100Com;
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS43S0000000_24(3), list);
        if (!listLJLLLL.isEmpty()) {
            Object objLJJJLL = C13LP.LJJJLL(listLJLLLL);
            if (objLJJJLL instanceof C20621515mf) {
                c20621515mf = (C20621515mf) objLJJJLL;
            } else {
                c20621515mf = null;
            }
            AbstractC1563960qni abstractC1563960qni = (AbstractC1563960qni) C13LP.LJJLIIIJL(listLJLLLL);
            JSONObject jSONObject = new JSONObject();
            C0XHY c0xhy = C0XHY.LIZ;
            JSONObject jSONObjectPut = jSONObject.put("type", this.LLILLJJLI.getMobName()).put("show_cnt", this.LLIZ);
            if (c20621515mf != null && (enumC325100Com = c20621515mf.LJFF) != null) {
                c0xhy.getClass();
                numValueOf = Integer.valueOf(C0XHY.LJ(enumC325100Com));
            } else {
                numValueOf = null;
            }
            JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("net_status", numValueOf);
            if (abstractC1563960qni != null) {
                str = abstractC1563960qni.LIZIZ;
            } else {
                str = null;
            }
            JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("current_step", str);
            Map<String, String> mapLIZJ = this.LL.LIZJ();
            c0xhy.getClass();
            C0XHY.LIZ(jSONObjectPutOpt2, mapLIZJ);
            if (this.LLILZ && c20621515mf != null) {
                Iterator it2 = listLJLLLL.iterator();
                long j4 = -1;
                long j5 = -1;
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            AbstractC1563960qni abstractC1563960qni2 = (AbstractC1563960qni) next2;
                            if (i > 0) {
                                jLIZIZ = C0XHY.LIZIZ(C0XHY.LIZ, abstractC1563960qni2.LIZJ - j5);
                                if (jLIZIZ == j4) {
                                    jSONObject.put("is_valid", 0);
                                    break;
                                }
                            } else {
                                jLIZIZ = -1;
                            }
                            if (abstractC1563960qni2 instanceof C20621515mf) {
                                jSONObject.put("p_uid", ((C20621515mf) abstractC1563960qni2).LJ);
                            } else if (abstractC1563960qni2 instanceof C20622215mm) {
                                jSONObject.put("waiting_cost", jLIZIZ);
                            } else if (abstractC1563960qni2 instanceof C20621915mj) {
                                jSONObject.put("count", ((C20621915mj) abstractC1563960qni2).LJ).put("prepare_cost", jLIZIZ);
                            } else if (abstractC1563960qni2 instanceof C20622115ml) {
                                jSONObject.put("pending_cost", jLIZIZ);
                            } else if (abstractC1563960qni2 instanceof C20621615mg) {
                                if (this.LLILLJJLI == EnumC20621415me.FYP) {
                                    j2 = abstractC1563960qni2.LIZJ;
                                    j3 = c20621515mf.LIZJ;
                                } else {
                                    Iterator it3 = ((ArrayList) list).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next = it3.next();
                                            if (next instanceof C20621915mj) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    AbstractC1563960qni abstractC1563960qni3 = (AbstractC1563960qni) next;
                                    if (abstractC1563960qni3 != null) {
                                        j2 = abstractC1563960qni2.LIZJ;
                                        j3 = abstractC1563960qni3.LIZJ;
                                    } else {
                                        j = -1;
                                        C20621615mg c20621615mg = (C20621615mg) abstractC1563960qni2;
                                        jSONObject.put("v_uid", c20621615mg.LJFF).put("v_tab", c20621615mg.LJ).put("inflate_cost", jLIZIZ).put("visible_cost", j);
                                    }
                                }
                                j = j2 - j3;
                                C20621615mg c20621615mg2 = (C20621615mg) abstractC1563960qni2;
                                jSONObject.put("v_uid", c20621615mg2.LJFF).put("v_tab", c20621615mg2.LJ).put("inflate_cost", jLIZIZ).put("visible_cost", j);
                            } else if (abstractC1563960qni2 instanceof C20622015mk) {
                                jSONObject.put("show_cost", jLIZIZ);
                            } else if (abstractC1563960qni2 instanceof C20621815mi) {
                                jSONObject.put("fail_reason", ((C20621815mi) abstractC1563960qni2).LJ);
                            } else {
                                throw new C1954807lC();
                            }
                            j5 = abstractC1563960qni2.LIZJ;
                            j4 = -1;
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        jSONObject.put("is_valid", 1);
                        break;
                    }
                }
            } else {
                jSONObject.put("is_valid", 0);
            }
            this.LLILLL.invoke("rec_user_popup_pref", jSONObject);
        }
    }

    @Override // X.InterfaceC20621715mh
    public final void M71(AbstractC1563960qni abstractC1563960qni) {
        if (this.LLILZ && !this.LLILZIL) {
            AbstractC1563960qni abstractC1563960qni2 = (AbstractC1563960qni) C13LP.LJJLIIIJL(this.LLILZLL);
            ((ArrayList) this.LLILZLL).add(abstractC1563960qni);
            if (abstractC1563960qni2 != null && abstractC1563960qni2.LIZ - abstractC1563960qni.LIZ > 0) {
                this.LLILZ = false;
                this.LLILZIL = true;
                C0XHY c0xhy = C0XHY.LIZ;
                AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 935);
                c0xhy.getClass();
                C0XHY.LIZLLL(awS575S0100000_31);
                return;
            }
            if ((abstractC1563960qni instanceof C20622015mk) || (abstractC1563960qni instanceof C20621815mi)) {
                this.LLILZIL = true;
                C0XHY c0xhy2 = C0XHY.LIZ;
                AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31(this, 936);
                c0xhy2.getClass();
                C0XHY.LIZLLL(awS575S0100000_312);
            }
        }
    }

    @Override // X.InterfaceC20621715mh
    public final void Mn0(String str) {
        this.LL.LIZ = str;
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            if ((c1075800e6M.LIZJ instanceof C1623606Xi) && c1075800e6M.LIZLLL()) {
                M71(new C20621815mi(0));
                return;
            }
            return;
        }
        if (abstractC1623806Xk instanceof C491001vg) {
            M71(new C20621815mi(-1));
        }
    }

    public RecUserPopupMonImpl(C1261270ivV c1261270ivV, EnumC20621415me enumC20621415me) {
        C20620615mW c20620615mW = new C20620615mW(C0XHY.LIZ);
        this.LL = c1261270ivV;
        this.LLILLJJLI = enumC20621415me;
        this.LLILLL = c20620615mW;
        this.LLILZ = true;
        this.LLILZLL = new ArrayList();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!this.LLILZIL && event == Lifecycle.Event.ON_DESTROY) {
            this.LLILZIL = true;
            LIZ(this.LLILZLL);
        }
        if (this.LLILZIL) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
