package com.ss.android.ugc.aweme.detail.prefab;

import X.C013C;
import X.C09JN;
import X.C0P4X;
import X.C11JF;
import X.C11NZ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1701940uOG;
import X.C2255108sX;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC459810I1j;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS109S0100000_9;
import Y.AfS178S0100000_9;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.detail.prefab.SearchBarAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchBarAssem extends DynamicAssem {
    public EditText LLJJI;
    public View LLJJIII;
    public boolean LLJJIJI = true;
    public C11JF LLJJIJIIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.eao;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        EditText editText = this.LLJJI;
        if (editText == null) {
            editText = null;
        }
        KeyboardUtils.LIZIZ(editText);
    }

    public final void lp(String str) {
        View view = this.LLJJIII;
        if (view == null) {
            view = null;
        }
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIIJIL = (C11JF) C11NZ.LJJJJZ(str).LJJI(50L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(this, 15), new C09JN() { // from class: X.0OAZ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("SearchBarAssem@ec97.onTextChanged$2");
                C1C7U.LIZIZ("SearchBarAssem@ec97.onTextChanged$2");
            }
        });
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        this.LLJJI = (EditText) view.findViewById(R.id.hd7);
        this.LLJJIII = view.findViewById(R.id.dzu);
        final C013C c013c = new C013C();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        EditText editText = null;
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            PageContentScrollAbility pageContentScrollAbility = new PageContentScrollAbility() { // from class: com.ss.android.ugc.aweme.detail.prefab.SearchBarAssem.onViewCreated.1
                @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility
                public final void oq(int i) {
                    SearchBarAssem searchBarAssem = SearchBarAssem.this;
                    if (!searchBarAssem.LLJJIJI) {
                        C013C c013c2 = c013c;
                        if (c013c2.element) {
                            c013c2.element = false;
                            EditText editText2 = searchBarAssem.LLJJI;
                            if (editText2 == null) {
                                editText2 = null;
                            }
                            KeyboardUtils.LIZIZ(editText2);
                        }
                    }
                    SearchBarAssem.this.LLJJIJI = false;
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, PageContentScrollAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, pageContentScrollAbility, PageContentScrollAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(pageContentScrollAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(pageContentScrollAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(PageContentScrollAbility.class.getClassLoader(), new Class[]{PageContentScrollAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, PageContentScrollAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageContentScrollAbility");
                    }
                }
            }
        }
        KeyBoardMonitor keyBoardMonitor = new KeyBoardMonitor(this);
        EditText editText2 = this.LLJJI;
        if (editText2 == null) {
            editText2 = null;
        }
        keyBoardMonitor.LIZ(editText2, new InterfaceC459810I1j(this) { // from class: X.0Oiw
            public final /* synthetic */ SearchBarAssem LLILLJJLI;

            @Override // X.InterfaceC459810I1j
            public final void V3() {
                c013c.element = true;
                EditText editText3 = this.LLILLJJLI.LLJJI;
                if (editText3 == null) {
                    editText3 = null;
                }
                editText3.setCursorVisible(true);
            }

            @Override // X.InterfaceC459810I1j
            public final void ub() {
                c013c.element = false;
                EditText editText3 = this.LLILLJJLI.LLJJI;
                if (editText3 == null) {
                    editText3 = null;
                }
                editText3.setCursorVisible(false);
            }

            {
                this.LLILLJJLI = this;
            }
        });
        EditText editText3 = this.LLJJI;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0Oiv
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3) {
                    this.LL.lp(textView.getText().toString());
                    return true;
                }
                return false;
            }
        });
        EditText editText4 = this.LLJJI;
        if (editText4 == null) {
            editText4 = null;
        }
        editText4.addTextChangedListener(new C0P4X(this, 1));
        if (!Intrinsics.LJFF(getConfig().LLILZ.get("prop_show_keyboard"), Boolean.FALSE)) {
            EditText editText5 = this.LLJJI;
            if (editText5 == null) {
                editText5 = null;
            }
            HandlerHook.viewPostDelay(editText5, new ARunnableS109S0100000_9(this, 32), 1000L);
        }
        View view2 = this.LLJJIII;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 30), view2);
        Object obj = getConfig().LLILZ.get("prop_hint_text");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            EditText editText6 = this.LLJJI;
            if (editText6 != null) {
                editText = editText6;
            }
            editText.setHint(str);
        }
    }
}
