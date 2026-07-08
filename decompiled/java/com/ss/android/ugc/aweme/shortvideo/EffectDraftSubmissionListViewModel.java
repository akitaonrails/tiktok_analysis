package com.ss.android.ugc.aweme.shortvideo;

import X.C13BV;
import X.C13LP;
import X.C1738590vLN;
import X.C2211008lQ;
import X.EnumC2159908dB;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableEffects;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class EffectDraftSubmissionListViewModel extends ViewModel {
    public final MutableLiveData<Uri> LL = new MutableLiveData<>();
    public final MutableLiveData<C1738590vLN<Unit>> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<List<C2211008lQ>> LLILLL = new MutableLiveData<>();
    public int LLILZ;
    public List<UploadableDraftEffect> LLILZIL;
    public List<UploadableMobileEffect> LLILZLL;

    public EffectDraftSubmissionListViewModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZIL = c13bv;
        this.LLILZLL = c13bv;
    }

    public final void vQ2(UploadableEffects uploadableEffects) {
        C2211008lQ c2211008lQ;
        C2211008lQ c2211008lQ2;
        this.LLILZ = 0;
        int size = uploadableEffects.draft_effects.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            UploadableDraftEffect uploadableDraftEffect = (UploadableDraftEffect) ListProtector.get(this.LLILZIL, i);
            if (uploadableDraftEffect.enableSubmission) {
                int i2 = this.LLILZ;
                if (i2 < 10) {
                    this.LLILZ = i2 + 1;
                    c2211008lQ2 = new C2211008lQ(EnumC2159908dB.DRAFT_EFFECT, true, uploadableDraftEffect, null);
                } else {
                    c2211008lQ2 = new C2211008lQ(EnumC2159908dB.DRAFT_EFFECT, false, uploadableDraftEffect, null);
                }
            } else {
                c2211008lQ2 = new C2211008lQ(EnumC2159908dB.DRAFT_EFFECT, false, uploadableDraftEffect, null);
            }
            arrayList.add(c2211008lQ2);
        }
        int size2 = uploadableEffects.mobile_effects.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            UploadableMobileEffect uploadableMobileEffect = (UploadableMobileEffect) ListProtector.get(this.LLILZLL, i3);
            if (uploadableMobileEffect.enableSubmission) {
                int i4 = this.LLILZ;
                if (i4 < 10) {
                    this.LLILZ = i4 + 1;
                    c2211008lQ = new C2211008lQ(EnumC2159908dB.MOBILE_EFFECT, true, null, uploadableMobileEffect);
                } else {
                    c2211008lQ = new C2211008lQ(EnumC2159908dB.MOBILE_EFFECT, false, null, uploadableMobileEffect);
                }
            } else {
                c2211008lQ = new C2211008lQ(EnumC2159908dB.MOBILE_EFFECT, false, null, uploadableMobileEffect);
            }
            arrayList2.add(c2211008lQ);
        }
        this.LLILLL.setValue(C13LP.LJLIL(arrayList2, arrayList));
    }
}
