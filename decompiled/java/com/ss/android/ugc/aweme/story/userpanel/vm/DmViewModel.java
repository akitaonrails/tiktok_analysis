package com.ss.android.ugc.aweme.story.userpanel.vm;

import X.C0YNP;
import X.C1431840nMc;
import X.C20615115ld;
import X.C20615415lg;
import X.C20622315mn;
import X.EnumC20615215le;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes32.dex */
public final class DmViewModel extends ViewModel {
    public C20615415lg LLILZIL;
    public boolean LLIZ;
    public final MutableLiveData<Map<String, EnumC20615215le>> LL = new MutableLiveData<>(new LinkedHashMap());
    public final Map<String, String> LLILLJJLI = new HashMap(new LinkedHashMap());
    public final List<String> LLILLL = new ArrayList();
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>(Boolean.FALSE);
    public final String LLILZLL = "";

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C20615415lg c20615415lg = this.LLILZIL;
        if (c20615415lg != null) {
            Iterator it2 = ((LinkedHashMap) c20615415lg.LIZLLL).entrySet().iterator();
            while (it2.hasNext()) {
                C20615115ld c20615115ld = (C20615115ld) ((Map.Entry) it2.next()).getValue();
                if (c20615115ld.LJ == EnumC20615215le.SENDING) {
                    c20615115ld.LIZ();
                }
            }
        }
        if (C20622315mn.LIZ()) {
            return;
        }
        EventBus.LIZLLL().LJIJJLI(C1431840nMc.class);
    }

    public final String vQ2(User user) {
        String strLJ = (String) ((HashMap) this.LLILLJJLI).get(user.getUid());
        if (strLJ == null) {
            strLJ = C0YNP.LJ(user.getUid());
        }
        ((HashMap) this.LLILLJJLI).put(user.getUid(), strLJ);
        return strLJ;
    }
}
