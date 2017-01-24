/*
 * Copyright 2015 Ripple OSI
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package uk.gov.hscic.patient.medication.search;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import uk.gov.hscic.common.repo.AbstractRepositoryFactoryTest;
import uk.gov.hscic.medication.search.DefaultMedicationSearchFactory;
import uk.gov.hscic.medication.search.MedicationSearch;
import uk.gov.hscic.medication.search.MedicationSearchFactory;

@RunWith(MockitoJUnitRunner.class)
public class DefaultMedicationSearchFactoryTest extends AbstractRepositoryFactoryTest<MedicationSearchFactory, MedicationSearch> {

    @Override
    protected MedicationSearchFactory createRepositoryFactory() {
        return new DefaultMedicationSearchFactory();
    }

    @Override
    protected Class<MedicationSearch> getRepositoryClass() {
        return MedicationSearch.class;
    }
}
