package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.AbstractC619610ORz;
import X.C01GW;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C13LE;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinEmojiCellScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class BulletinCommentBaseCell<T extends AbstractC619610ORz> extends PowerCell<T> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(169));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinCommentBaseCell) this, 641));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinCommentBaseCell) this, 638));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinCommentBaseCell) this, 637));
    public final C736950SvV LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinEmojiCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEmojiCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public BulletinCommentBaseCell() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9((BulletinCommentBaseCell) this, 640);
        this.LLILZIL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(325), null, null, null);
        this.LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9((BulletinCommentBaseCell) this, 639));
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }
}
