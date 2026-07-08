package com.bytedance.applog.priority;

import X.C1B0W;

/* JADX INFO: loaded from: classes35.dex */
public final class NativePriorityEventMetaFactoryImpl implements PriorityEventMetaFactory {
    public final PriorityEventMetaFactory metaInjector;

    @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
    public String abSdkVersion() {
        return this.metaInjector.abSdkVersion();
    }

    @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
    public long eventId() {
        return this.metaInjector.eventId();
    }

    @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
    public long eventIndex() {
        return this.metaInjector.eventIndex();
    }

    @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
    public int nt() {
        return this.metaInjector.nt();
    }

    @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
    public C1B0W user() {
        return this.metaInjector.user();
    }

    public final long userUid() {
        C1B0W c1b0wUser = this.metaInjector.user();
        if (c1b0wUser != null) {
            return c1b0wUser.LJFF;
        }
        return 0L;
    }

    public final long userUserId() {
        C1B0W c1b0wUser = this.metaInjector.user();
        if (c1b0wUser != null) {
            return c1b0wUser.LIZIZ;
        }
        return 0L;
    }

    public final int userUserIsAuth() {
        C1B0W c1b0wUser = this.metaInjector.user();
        if (c1b0wUser != null) {
            return c1b0wUser.LIZLLL;
        }
        return 0;
    }

    public final int userUserIsLogin() {
        C1B0W c1b0wUser = this.metaInjector.user();
        if (c1b0wUser != null) {
            return c1b0wUser.LIZJ;
        }
        return 0;
    }

    public final int userUserType() {
        C1B0W c1b0wUser = this.metaInjector.user();
        if (c1b0wUser != null) {
            return c1b0wUser.LJ;
        }
        return 0;
    }

    public final String userUuid() {
        C1B0W c1b0wUser = this.metaInjector.user();
        if (c1b0wUser != null) {
            return c1b0wUser.LIZ;
        }
        return null;
    }

    public final PriorityEventMetaFactory getMetaInjector() {
        return this.metaInjector;
    }

    public NativePriorityEventMetaFactoryImpl(PriorityEventMetaFactory priorityEventMetaFactory) {
        this.metaInjector = priorityEventMetaFactory;
    }

    @Override // com.bytedance.applog.priority.PriorityEventMetaFactory
    public int sentryStainedValue(String str) {
        return this.metaInjector.sentryStainedValue(str);
    }
}
