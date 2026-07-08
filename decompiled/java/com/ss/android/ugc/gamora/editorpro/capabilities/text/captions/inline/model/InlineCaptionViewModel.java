package com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.model;

import X.AbstractC2217051Bpv;
import X.C357780E0y;
import X.C384380F5g;
import X.C560530Lyd;
import X.C891980Yyy;
import X.InterfaceC384430F5l;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class InlineCaptionViewModel extends ViewModel {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final C560530Lyd<String> LL = new C560530Lyd<>();
    public final C560530Lyd<LanguageDetail> LLILLJJLI = new C560530Lyd<>();
    public ArrayList<LanguageDetail> LLILLL;
    public final C891980Yyy LLILZ;
    public final C384380F5g LLILZIL;
    public final boolean LLILZLL;
    public AbstractC2217051Bpv LLIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0F5g] */
    public InlineCaptionViewModel() {
        new ArrayList();
        this.LLILZ = new C891980Yyy();
        this.LLILZIL = new InterfaceC384430F5l() { // from class: X.0F5g
            @Override // X.InterfaceC384430F5l
            public final void LIZ(NLETrackSlot nLETrackSlot, String str) {
                this.LIZ.LL.LJIIIZ(str);
            }
        };
        this.LLILZLL = C357780E0y.LIZ();
    }

    public final String vQ2(String str) {
        LanguageDetail next;
        String str2;
        ArrayList<LanguageDetail> arrayList = this.LLILLL;
        if (arrayList != null) {
            Iterator<LanguageDetail> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.localName, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LanguageDetail languageDetail = next;
            if (languageDetail != null && (str2 = languageDetail.code) != null) {
                return str2;
            }
        }
        return "";
    }

    public final String wQ2(String str) {
        LanguageDetail next;
        ArrayList<LanguageDetail> arrayList = this.LLILLL;
        if (arrayList == null) {
            return null;
        }
        Iterator<LanguageDetail> it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.code, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LanguageDetail languageDetail = next;
        if (languageDetail == null) {
            return null;
        }
        return languageDetail.localName;
    }
}
