package com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.directshow;

import X.C1363050lZf;
import X.C1363060lZg;
import X.C1365220ldA;
import X.C1365330ldL;
import X.C1370970lmR;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1529905yr;
import X.C2097608Jq;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1362600lYw;
import X.InterfaceC1364650lcF;
import X.InterfaceC1365090lcx;
import X.InterfaceC1365250ldD;
import Y.ARunnableS25S1200000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public final class DirectShowShareTextBoxViewModel extends ShareTextBoxViewModel {
    public final SharePackage LLJL;
    public final MutableLiveData<Boolean> LLJLIL;
    public final C1363060lZg LLJLILLLLZIIL;
    public final InterfaceC1365250ldD LLJLL;
    public final InterfaceC1365090lcx LLJLLIL;

    @Override // com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel
    public final void x9(List<? extends IMContact> list) {
        this.LLJJJJJIL = list;
        InterfaceC1365090lcx interfaceC1365090lcx = this.LLJLLIL;
        if (interfaceC1365090lcx != null) {
            interfaceC1365090lcx.LIZ(list);
        }
        GQ2();
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel
    public final void wQ2(String str, HashMap map) {
        boolean z;
        Object obj;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_with_message", obj);
        InterfaceC1365090lcx interfaceC1365090lcx = this.LLJLLIL;
        if (interfaceC1365090lcx == null || !interfaceC1365090lcx.isChecked()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_picture_share", str2);
        map.put("panel_source", "shot_in_app");
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel
    public final void BQ2(List<? extends IMContact> list, final String str, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z) {
        Activity activityLIZ;
        BaseContent baseContent2 = baseContent;
        String string = this.LLJL.extras.getString("screenshot_image_path");
        if (string != null && string.length() > 0) {
            Iterator<? extends IMContact> it2 = list.iterator();
            while (it2.hasNext()) {
                String strLIZIZ = C1529905yr.LIZIZ(it2.next());
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                MediaModel mediaModel = new MediaModel("");
                mediaModel.LJIILL(string);
                mediaModel.type = 1;
                C1440005kM.LIZ(new IMMediaPublishEvent.DMAlbumMediaPublishEvent(strLIZIZ, Collections.singletonList(mediaModel), C2097608Jq.LJIIJ(new Pair("enter_from", "live"), new Pair("enter_method", "screenshot_share_panel")), null, QuoteMode.None.INSTANCE, null, null, null, null));
            }
            Context context = this.LLJLILLLLZIIL.LIZ.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131844054);
                c1389890mGx.LJIIJJI();
            }
        }
        InterfaceC1365090lcx interfaceC1365090lcx = this.LLJLLIL;
        if (interfaceC1365090lcx != null) {
            if (!interfaceC1365090lcx.isChecked() && (str == null || str.length() == 0)) {
                xQ2(str, UUID.randomUUID().toString(), list);
                C1365220ldA c1365220ldA = C1365220ldA.LIZ;
                InterfaceC1362600lYw interfaceC1362600lYw = new InterfaceC1362600lYw() { // from class: X.0lcw
                    @Override // X.InterfaceC1362600lYw
                    public final void LIZ(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LIZLLL(HashMap<String, String> map4) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJ(HashMap<String, String> map4) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJFF(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJI(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJII(Dialog dialog, SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final boolean LJIIIIZZ(SharePackage sharePackage) {
                        return true;
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIIJ(SharePackage sharePackage, String str2) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIIJJI(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIIL(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIILIIL() {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LIZIZ(HashMap<String, String> map4) {
                        this.LIZ.wQ2(str, map4);
                        InterfaceC1365250ldD interfaceC1365250ldD = this.LIZ.LLJLL;
                        if (interfaceC1365250ldD != null) {
                            interfaceC1365250ldD.LIZIZ(map4);
                        }
                    }
                };
                c1365220ldA.getClass();
                ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
                if (executorServiceLIZLLL != null) {
                    executorServiceLIZLLL.submit(new ARunnableS25S1200000_21(list, str, interfaceC1362600lYw, 1));
                }
                this.LLJLIL.setValue(Boolean.TRUE);
                return;
            }
            if (!interfaceC1365090lcx.isChecked()) {
                if (str == null || str.length() == 0) {
                    return;
                }
                this.LLJL.extras.putBoolean("key_only_share_with_text_content", true);
                TextContent textContentObtain = TextContent.Companion.obtain(str, null, null, null, null, null);
                C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                SharePackage sharePackage = this.LLJL;
                c1365330ldL.getClass();
                C1365330ldL.LJIIL(textContentObtain, textContentObtain, sharePackage);
                baseContent2 = textContentObtain;
            }
            super.BQ2(list, str, baseContent2, map, map2, map3, z);
        }
    }

    public DirectShowShareTextBoxViewModel(SharePackage sharePackage, MutableLiveData mutableLiveData, C1363060lZg c1363060lZg, InterfaceC1365250ldD interfaceC1365250ldD, InterfaceC1364650lcF interfaceC1364650lcF, boolean z, boolean z2, boolean z3) {
        super(sharePackage, interfaceC1365250ldD, interfaceC1364650lcF, mutableLiveData, c1363060lZg, z, z2, z3, null);
        this.LLJL = sharePackage;
        this.LLJLIL = mutableLiveData;
        this.LLJLILLLLZIIL = c1363060lZg;
        this.LLJLL = interfaceC1365250ldD;
        if (sharePackage.extras.getBoolean("key_show_checkbox_directly_when_select")) {
            C786410Ut5.LJZL(0, this.LLILZLL.LIZ);
            IInternalShareApi.LIZ.getClass();
            C1363050lZf c1363050lZfLJJIIZI = C1370970lmR.LIZ().LIZIZ().LJJIIZI(this.LLILZLL, sharePackage, this, z);
            c1363050lZfLJJIIZI.LIZLLL();
            this.LLJLLIL = c1363050lZfLJJIIZI;
        }
    }
}
