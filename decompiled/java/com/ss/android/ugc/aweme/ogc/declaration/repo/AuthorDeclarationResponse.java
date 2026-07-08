package com.ss.android.ugc.aweme.ogc.declaration.repo;

import X.C09CT;
import X.C13BV;
import X.C15438062q;
import com.ss.android.ugc.aweme.feed.model.DeclarationOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthorDeclarationResponse {
    public static final int $stable = 8;

    @C09CT("declaration_options")
    public List<DeclarationOptions> declarationOptions;

    @C09CT("integrate_entrance")
    public Boolean integrateEntrance;

    public AuthorDeclarationResponse() {
        this(null, null);
    }

    public final List<DeclarationOption> getSupportDeclarationTypes() {
        List<DeclarationOptions> list = this.declarationOptions;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<DeclarationOptions> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(DeclarationOption.Companion.parseFrom(it2.next().type));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != DeclarationOption.UNSPECIFIED) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final DeclarationOptions getDeclarationOptions(DeclarationOption declarationOption) {
        List<DeclarationOptions> list = this.declarationOptions;
        DeclarationOptions declarationOptions = null;
        if (list == null) {
            return null;
        }
        Iterator<DeclarationOptions> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DeclarationOptions next = it2.next();
            Integer num = next.type;
            int serverValue = declarationOption.getServerValue();
            if (num != null && num.intValue() == serverValue) {
                declarationOptions = next;
                break;
            }
        }
        return declarationOptions;
    }

    public final void setDeclarationOptions(List<DeclarationOptions> list) {
        this.declarationOptions = list;
    }

    public final void setIntegrateEntrance(Boolean bool) {
        this.integrateEntrance = bool;
    }

    public AuthorDeclarationResponse(Boolean bool, List<DeclarationOptions> list) {
        this.integrateEntrance = bool;
        this.declarationOptions = list;
    }
}
