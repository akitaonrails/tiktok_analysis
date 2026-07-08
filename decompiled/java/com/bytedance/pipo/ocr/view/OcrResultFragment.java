package com.bytedance.pipo.ocr.view;

import X.C2186421Ahc;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import co5.g;
import com.bytedance.pipo.ocr.ocr.OcrResultViewModel;
import eo5.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class OcrResultFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZiovO2HELIOSElISA7ZwAwOhcpOjo/PAM+KCg+LSs4";
    public b LL;
    public Function0<Unit> LLILLJJLI;
    public OcrResultViewModel LLILLL;
    public C2186421Ahc LLILZ;
    public final long LLILZIL = System.currentTimeMillis();
    public View LLILZLL;
    public LinearLayoutCompat LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public g LLJILJIL;

    public final int MR(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILLL = (OcrResultViewModel) new ViewModelProvider(this, new ViewModelProvider.Factory() { // from class: X.13tT
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new OcrResultViewModel();
            }
        }).get(OcrResultViewModel.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x02c8  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pipo.ocr.view.OcrResultFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
