package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.effect;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C09U0;
import X.C13LE;
import X.C1807670x8n;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C908590Zkf;
import X.C908640Zkk;
import X.C912070ZqH;
import X.C914160Zte;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC911530ZpP;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: loaded from: classes15.dex */
public final class CategoryEffectViewModel extends AssemViewModel<InterfaceC0148002o> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public boolean LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final InterfaceC911530ZpP LLILZ;
    public AnonymousClass0956 LLILZIL;
    public volatile C09U0 LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CategoryEffectViewModel.class, "ttDispatcher", "getTtDispatcher()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(12);
    }

    public CategoryEffectViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C908640Zkk.LIZ);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILZ = C912070ZqH.LIZIZ.LJJIFFI();
    }

    public final void vQ2(Context context) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(context)) {
            AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
            C09U0 c09u0 = this.LLILZLL;
            if (c09u0 == null) {
                synchronized (this) {
                    c09u0 = this.LLILZLL;
                    if (c09u0 == null) {
                        c09u0 = (C09U0) C1807670x8n.p();
                        this.LLILZLL = c09u0;
                    }
                }
            }
            this.LLILZIL = C23250099c.LIZLLL(viewModelScope, c09u0.LIZ, null, new C908590Zkf(this, context, null), 2);
        }
    }
}
