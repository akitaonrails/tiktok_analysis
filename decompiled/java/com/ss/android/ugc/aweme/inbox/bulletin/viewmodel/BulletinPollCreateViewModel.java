package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C0OPX;
import X.C0OU6;
import X.C0OVX;
import X.C2188811AlT;
import X.C620710OWf;
import X.C620750OWj;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.Configuration;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPollCreateViewModel extends AssemViewModel<C0OVX> {
    public static final int LLILZLL = ((Configuration) C620750OWj.LIZIZ.getValue()).optionCountMax;
    public int LLILLJJLI;
    public C620710OWf LLILZIL;
    public String LL = "";
    public final List<BulletinPollOption> LLILLL = new ArrayList();
    public int LLILZ = 1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OVX(0);
    }

    public final void vQ2() {
        boolean z = false;
        if (!a0.LJJJIL(this.LL)) {
            List<BulletinPollOption> list = this.LLILLL;
            if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str = ((BulletinPollOption) it2.next()).content;
                    if (str == null) {
                        str = "";
                    }
                    if (a0.LJJJIL(str)) {
                        z = true;
                        break;
                    }
                }
            }
            z = !z;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkPublishState() ");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        setState(new AwS24S0010000_9(z, 4));
    }

    public final void wQ2(Map<String, ? extends Object> map) {
        String str;
        int iIntValue;
        Integer num;
        List list;
        if (!C0OU6.LIZ()) {
            this.LLILZIL = null;
            return;
        }
        if (map == null) {
            return;
        }
        C0OPX.LJII("initTemplatePollContent()");
        Object obj = map.get("title");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        Object obj2 = map.get("options");
        if ((obj2 instanceof List) && (list = (List) obj2) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next()));
            }
        }
        Object obj3 = map.get("duration");
        if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        this.LLILZIL = new C620710OWf(str, arrayList, iIntValue);
    }
}
