package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm;

import X.AbstractC503810JpL;
import X.C1554960qZC;
import X.C497740JfY;
import X.C501810Jm7;
import X.C501820Jm8;
import X.C502060JmW;
import X.C502230Jmn;
import X.C502280Jms;
import X.C502390Jn3;
import X.C502400Jn4;
import X.C502440Jn8;
import X.C502450Jn9;
import X.C502460JnA;
import X.C502470JnB;
import X.C502480JnC;
import X.C502490JnD;
import X.EnumC503090JoB;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import webcast.api.sub.PostCreateReq;
import webcast.api.sub.SpacePollReqInfo;
import webcast.api.sub.TopicByCategory;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceNewPostVM extends AssemViewModel<C502060JmW> {
    public InterfaceC665370Q7z LL;
    public C501810Jm7 LLILLJJLI;
    public C502390Jn3 LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C502060JmW(0);
    }

    public final Collection<AbstractC503810JpL> vQ2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C502460JnA(new C502230Jmn()));
        arrayList.add(new C502450Jn9(new C502280Jms(1, true)));
        arrayList.add(new C502450Jn9(new C502280Jms(2, true)));
        arrayList.add(new C502490JnD());
        return arrayList;
    }

    public final PostCreateReq wQ2() {
        ArrayList<AbstractC503810JpL> arrayList;
        AbstractC503810JpL next;
        C502460JnA c502460JnA;
        C502230Jmn c502230Jmn;
        String str;
        C502390Jn3 c502390Jn3 = this.LLILLL;
        if (c502390Jn3 != null && (arrayList = c502390Jn3.LL) != null) {
            Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next instanceof C502460JnA) {
                    break;
                }
            }
            if (!(next instanceof C502460JnA) || (c502460JnA = (C502460JnA) next) == null || (c502230Jmn = c502460JnA.LIZ) == null || (str = c502230Jmn.LIZ) == null || a0.LJJJIL(str)) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC503810JpL abstractC503810JpL : arrayList) {
                if (abstractC503810JpL instanceof C502450Jn9) {
                    String str2 = ((C502450Jn9) abstractC503810JpL).LIZ.LIZIZ;
                    String string = a0.LJLIIIL(str2).toString();
                    if (string == null || string.length() == 0) {
                        return null;
                    }
                    arrayList2.add(a0.LJLIIIL(str2).toString());
                }
            }
            if (arrayList.size() < 2) {
                return null;
            }
            PostCreateReq postCreateReq = new PostCreateReq();
            SpacePollReqInfo spacePollReqInfo = new SpacePollReqInfo();
            spacePollReqInfo.optionList = arrayList2;
            postCreateReq.text = str;
            postCreateReq.contentType = EnumC503090JoB.POLL.getValue();
            postCreateReq.pollInfo = spacePollReqInfo;
            return postCreateReq;
        }
        return null;
    }

    public final C501810Jm7 xQ2() {
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C501810Jm7.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C501810Jm7) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    public final ArrayList<AbstractC503810JpL> yQ2(List<TopicByCategory> list, SpaceTopicCategory spaceTopicCategory) {
        int size;
        C501810Jm7 c501810Jm7XQ2;
        C501820Jm8 c501820Jm8;
        TopicByCategory topicByCategory;
        SpaceTopicCategory spaceTopicCategory2;
        SpaceTopicContent spaceTopicContent;
        List<SpaceTopicContent> list2;
        C501820Jm8 c501820Jm82;
        SpaceTopicInfo spaceTopicInfo;
        C501820Jm8 c501820Jm83;
        SpaceTopicInfo spaceTopicInfo2;
        TopicByCategory next;
        C501820Jm8 c501820Jm84;
        TopicByCategory topicByCategory2;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size <= 0) {
            return null;
        }
        ArrayList<AbstractC503810JpL> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<TopicByCategory> it2 = list.iterator();
            while (it2.hasNext()) {
                SpaceTopicCategory spaceTopicCategory3 = it2.next().topicCategory;
                if (spaceTopicCategory3 != null) {
                    arrayList2.add(spaceTopicCategory3);
                }
            }
        }
        SpaceTopicCategory spaceTopicCategory4 = new SpaceTopicCategory();
        spaceTopicCategory4.topicCategoryId = -1211L;
        spaceTopicCategory4.topicCategoryText = C497740JfY.LJIJI(2131856514);
        arrayList2.add(spaceTopicCategory4);
        arrayList.add(new C502440Jn8(arrayList2));
        if (spaceTopicCategory != null && spaceTopicCategory.topicCategoryId == -1211) {
            arrayList.addAll(vQ2());
        } else {
            arrayList.add(new C502480JnC());
            if (spaceTopicCategory == null && (list == null || (topicByCategory2 = (TopicByCategory) ListProtector.get(list, 0)) == null || (spaceTopicCategory = topicByCategory2.topicCategory) == null)) {
                return null;
            }
            C501810Jm7 c501810Jm7XQ22 = xQ2();
            if ((c501810Jm7XQ22 == null || (c501820Jm84 = c501810Jm7XQ22.LL) == null || c501820Jm84.LIZIZ == null) && (c501810Jm7XQ2 = xQ2()) != null && (c501820Jm8 = c501810Jm7XQ2.LL) != null) {
                c501820Jm8.LIZIZ = spaceTopicCategory;
            }
            if (list != null) {
                Iterator<TopicByCategory> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        SpaceTopicCategory spaceTopicCategory5 = next.topicCategory;
                        if (spaceTopicCategory5 != null && spaceTopicCategory5.topicCategoryId == spaceTopicCategory.topicCategoryId) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                topicByCategory = next;
            } else {
                topicByCategory = null;
            }
            C501810Jm7 c501810Jm7XQ23 = xQ2();
            if (c501810Jm7XQ23 != null && (c501820Jm83 = c501810Jm7XQ23.LL) != null && (spaceTopicInfo2 = c501820Jm83.LJ) != null) {
                spaceTopicCategory2 = spaceTopicInfo2.spaceTopicCategory;
            } else {
                spaceTopicCategory2 = null;
            }
            C501810Jm7 c501810Jm7XQ24 = xQ2();
            if (c501810Jm7XQ24 != null && (c501820Jm82 = c501810Jm7XQ24.LL) != null && (spaceTopicInfo = c501820Jm82.LJ) != null) {
                spaceTopicContent = spaceTopicInfo.spaceTopicContent;
            } else {
                spaceTopicContent = null;
            }
            if (spaceTopicCategory2 != null && spaceTopicCategory2.topicCategoryId == spaceTopicCategory.topicCategoryId && spaceTopicContent != null) {
                arrayList.add(new C502470JnB(spaceTopicContent));
            }
            if (topicByCategory != null && (list2 = topicByCategory.topicContentList) != null) {
                for (SpaceTopicContent spaceTopicContent2 : list2) {
                    if (spaceTopicContent == null || spaceTopicContent.topicContentId != spaceTopicContent2.topicContentId) {
                        arrayList.add(new C502470JnB(spaceTopicContent2));
                    }
                }
            }
        }
        arrayList.add(new C502400Jn4((Object) null));
        return arrayList;
    }
}
