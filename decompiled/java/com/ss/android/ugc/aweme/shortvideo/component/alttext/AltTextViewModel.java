package com.ss.android.ugc.aweme.shortvideo.component.alttext;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AltTextViewModel extends ViewModel {
    public final MutableLiveData<List<String>> LL = new MutableLiveData<>(new ArrayList());
    public final MutableLiveData<List<SingleImageData>> LLILLJJLI = new MutableLiveData<>(new ArrayList());

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus vQ2() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus r4 = new com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus
            r0 = 0
            r4.<init>(r0, r0, r0, r0)
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.creative.model.edit.SingleImageData>> r0 = r8.LLILLJJLI
            java.lang.Object r3 = r0.getValue()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L8f
            int r2 = r3.size()
            r1 = 0
        L15:
            if (r1 >= r2) goto L8f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r0
            com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r0 = r0.getSrcImageInfo()
            java.lang.String r7 = r0.getAltText()
            androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> r0 = r8.LL
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L8d
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            java.lang.String r6 = (java.lang.String) r6
        L35:
            r5 = 1
            if (r7 == 0) goto L3e
            int r0 = r7.length()
            if (r0 != 0) goto L51
        L3e:
            if (r6 == 0) goto L4f
            int r0 = r6.length()
            if (r0 == 0) goto L4f
            int r0 = r4.getAltTextAdded()
            int r0 = r0 + 1
            r4.setAltTextAdded(r0)
        L4f:
            if (r7 == 0) goto L68
        L51:
            int r0 = r7.length()
            if (r0 == 0) goto L68
            if (r6 == 0) goto L5f
            int r0 = r6.length()
            if (r0 != 0) goto L68
        L5f:
            int r0 = r4.getAltTextDeleted()
            int r0 = r0 + 1
            r4.setAltTextDeleted(r0)
        L68:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r6)
            if (r0 != 0) goto L8a
            r4.setAltTextChanged(r5)
            if (r7 == 0) goto L8a
            int r0 = r7.length()
            if (r0 == 0) goto L8a
            if (r6 == 0) goto L8a
            int r0 = r6.length()
            if (r0 == 0) goto L8a
            int r0 = r4.getAltTextEdited()
            int r0 = r0 + 1
            r4.setAltTextEdited(r0)
        L8a:
            int r1 = r1 + 1
            goto L15
        L8d:
            r6 = 0
            goto L35
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.component.alttext.AltTextViewModel.vQ2():com.ss.android.ugc.aweme.creative.model.AltTextChangeStatus");
    }
}
