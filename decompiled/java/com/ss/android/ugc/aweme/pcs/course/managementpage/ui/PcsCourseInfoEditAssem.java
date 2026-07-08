package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.AbstractC738140SxQ;
import X.C0DL6;
import X.C0JHC;
import X.C0WZX;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C16F5;
import X.C1748440vbG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC1555100qZQ;
import X.ViewOnFocusChangeListenerC521740KdA;
import Y.ATListenerS441S0100000_7;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseInfoEditAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseDescVAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseNameVAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS22S0010000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseInfoEditAssem extends UISlotAssem implements IPcsCourseNameVAbility, IPcsCourseDescVAbility {
    public final C736950SvV LLJJI = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(128), new AwS551S0100000_7((AbstractC738140SxQ) this, 374), new C451610HnL(this, true, true), new C723700Sa8(this));
    public C0JHC LLJJIII;
    public C1748440vbG LLJJIJI;
    public EditText LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public LiveIconView LLJJJ;
    public ViewGroup LLJJJIL;
    public ViewGroup LLJJJJ;
    public C16F5 LLJJJJJIL;
    public LiveIconView LLJJJJLIIL;
    public boolean LLJJL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hlc;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseDescVAbility
    public final String I90() {
        Editable editableLLJILLL;
        String string;
        EditText editText = this.LLJJIJIIJIL;
        return (editText == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqrcNHN0ye78R3qIkxlfvPpcVJhc4kpQRn4D3Twy5s5R/966PyQVg6SkIxStprxZQxgIg==", null))) == null || (string = editableLLJILLL.toString()) == null) ? "" : string;
    }

    public final PcsCourseManageVM hp() {
        return (PcsCourseManageVM) this.LLJJI.getValue();
    }

    public final C0JHC ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", C0JHC.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C0JHC) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseNameVAbility
    public final String kb1() {
        Editable text;
        String string;
        C1748440vbG c1748440vbG = this.LLJJIJI;
        return (c1748440vbG == null || (text = c1748440vbG.getText()) == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IPcsCourseNameVAbility.class, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI2, null), IPcsCourseDescVAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1748440vbG c1748440vbG;
        EditText editText;
        C16F5 c16f5;
        LiveIconView liveIconView;
        C16F5 c16f52;
        LiveIconView liveIconView2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onViewCreated(view);
        if (view != null) {
            view.findViewById(R.id.p0w);
        }
        if (view != null) {
            c1748440vbG = (C1748440vbG) view.findViewById(R.id.p0g);
        } else {
            c1748440vbG = null;
        }
        this.LLJJIJI = c1748440vbG;
        if (view != null) {
            view.findViewById(R.id.foa);
            editText = (EditText) view.findViewById(R.id.fn4);
        } else {
            editText = null;
        }
        this.LLJJIJIIJIL = editText;
        if (view != null) {
            c16f5 = (C16F5) view.findViewById(R.id.fo4);
        } else {
            c16f5 = null;
        }
        this.LLJJIJIL = c16f5;
        if (view != null) {
            liveIconView = (LiveIconView) view.findViewById(R.id.fo2);
        } else {
            liveIconView = null;
        }
        this.LLJJJ = liveIconView;
        if (view != null) {
            c16f52 = (C16F5) view.findViewById(R.id.p0v);
        } else {
            c16f52 = null;
        }
        this.LLJJJJJIL = c16f52;
        if (view != null) {
            liveIconView2 = (LiveIconView) view.findViewById(R.id.p0t);
        } else {
            liveIconView2 = null;
        }
        this.LLJJJJLIIL = liveIconView2;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.fo3);
        } else {
            viewGroup = null;
        }
        this.LLJJJIL = viewGroup;
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.p0u);
        } else {
            viewGroup2 = null;
        }
        this.LLJJJJ = viewGroup2;
        C1748440vbG c1748440vbG2 = this.LLJJIJI;
        if (c1748440vbG2 != null) {
            c1748440vbG2.setSingleLine(true);
            c1748440vbG2.setMaxLines(1);
            c1748440vbG2.setImeOptions(6);
            c1748440vbG2.setMaxLength(50);
            c1748440vbG2.LIZ(new C0DL6() { // from class: X.0JDg
                @Override // X.C0DL6, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    boolean z;
                    editable.toString();
                    PcsCourseManageVM pcsCourseManageVMHp = this.LL.hp();
                    if (editable.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pcsCourseManageVMHp.getClass();
                    pcsCourseManageVMHp.setState(new AwS22S0010000_7(z, 1));
                    PcsCourseInfoEditAssem pcsCourseInfoEditAssem = this.LL;
                    if (pcsCourseInfoEditAssem.LLJJL) {
                        pcsCourseInfoEditAssem.hp().FQ2(true);
                    }
                }
            });
            c1748440vbG2.setEditTextOnFocusChangeListener(new ViewOnFocusChangeListenerC521740KdA(this, 0));
        }
        EditText editText2 = this.LLJJIJIIJIL;
        if (editText2 != null) {
            editText2.addTextChangedListener(new C0DL6() { // from class: X.0JDh
                @Override // X.C0DL6, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    PcsCourseInfoEditAssem pcsCourseInfoEditAssem = this.LL;
                    if (pcsCourseInfoEditAssem.LLJJL) {
                        pcsCourseInfoEditAssem.hp().FQ2(true);
                    }
                }
            });
            editText2.setOnTouchListener(new ATListenerS441S0100000_7(this, 11));
            editText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC521740KdA(this, 1));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JDa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C488550JDx) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 64), 6);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IPcsCourseNameVAbility.class, null, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI2, null), this, IPcsCourseDescVAbility.class, null, null);
        }
    }
}
