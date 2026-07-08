package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C01GW;
import X.C13LE;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1775660wJA;
import X.C19719912Dl;
import X.C1AF0;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C992303uL;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DescItemViewHolder extends BaseViewHolder {
    public final C01GW LLJILJILJ;
    public final Map<LinkText, Boolean> LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public DescItemViewHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aia, viewGroup));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressEditViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 18));
        this.LLJILLL = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: W5 */
    public final void rr(C1745680vWo c1745680vWo) {
        int length;
        String text;
        super.rr(c1745680vWo);
        if (Intrinsics.LJFF(c1745680vWo.LIZ.key, "notice")) {
            C426750GoL.LJIIL(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(this.itemView.getPaddingTop()), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(this.itemView.getPaddingBottom()), 16);
        } else {
            View view = this.itemView;
            C426750GoL.LJIIL(view, Integer.valueOf(view.getPaddingStart()), Integer.valueOf(this.itemView.getPaddingTop()), Integer.valueOf(this.itemView.getPaddingEnd()), Integer.valueOf(this.itemView.getPaddingBottom()), 16);
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView;
        InputItemDTO inputItemDTO = c1745680vWo.LIZ;
        Map<String, LinkText> map = inputItemDTO.arguments;
        if (map != null) {
            String str = inputItemDTO.title;
            if (str == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder(str);
            ArrayList<LinkText> arrayList = new ArrayList();
            Iterator<String> it2 = map.keySet().iterator();
            while (true) {
                boolean z = false;
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                LinkText linkText = map.get(next);
                if (linkText != null && (text = linkText.getText()) != null) {
                    arrayList.add(linkText);
                    int iIndexOf = sb.indexOf(next);
                    if (iIndexOf == -1) {
                        z = true;
                    }
                    IEnsure iEnsure = C1AF0.LIZ;
                    if (iEnsure != null) {
                        iEnsure.ensureFalse(z, "starling key not found");
                    }
                    if (iIndexOf >= 0) {
                        sb.replace(iIndexOf, next.length() + iIndexOf, text);
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            for (LinkText linkText2 : arrayList) {
                if (!this.LLJILLL.containsKey(linkText2)) {
                    this.LLJILLL.put(linkText2, Boolean.FALSE);
                }
                String text2 = linkText2.getText();
                if (text2 == null) {
                    text2 = "";
                }
                int iIndexOf2 = sb.indexOf(text2);
                String text3 = linkText2.getText();
                if (text3 != null) {
                    length = text3.length();
                } else {
                    length = 0;
                }
                int i = length + iIndexOf2;
                if (iIndexOf2 >= 0 && i <= sb.length()) {
                    C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iIndexOf2, i, 17);
                    C786410Ut5.q2(spannableStringBuilder, new C1775660wJA(linkText2, c1745680vWo, tuxTextView, 0), iIndexOf2, i, 17);
                    Object obj = ((LinkedHashMap) this.LLJILLL).get(linkText2);
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.LJFF(obj, bool) && Intrinsics.LJFF(c1745680vWo.LIZ.key, "notice")) {
                        this.LLJILLL.put(linkText2, bool);
                        C1745480vWU.LJFF(((AddressEditViewModel) this.LLJILJILJ.getValue()).LLJJIJIL, "privacy_policy", null, null, 6);
                    }
                }
            }
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setClickable(true);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        tuxTextView.setText(inputItemDTO.title);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
        rr((C1745680vWo) obj);
    }
}
